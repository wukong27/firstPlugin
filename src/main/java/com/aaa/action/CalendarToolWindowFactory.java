// Copyright 2000-2023 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package com.aaa.action;

import com.aaa.action.corn.RandomPwd;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.ComboBox;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.JBColor;
import com.intellij.ui.components.JBLabel;
import com.intellij.ui.components.JBTabbedPane;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

public class CalendarToolWindowFactory implements ToolWindowFactory, DumbAware {

  @Override
  public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
    CalendarToolWindowContent toolWindowContent = new CalendarToolWindowContent(toolWindow);
    Content content = ContentFactory.getInstance().createContent(toolWindowContent.getContentPanel(), "", true);
    toolWindow.getContentManager().addContent(content);
  }

  private static class CalendarToolWindowContent {
    private final JPanel c = new JPanel();

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

//    private static String zoned = "+8";
    private final JLabel timeMsgLabel = new JLabel();

    public CalendarToolWindowContent(ToolWindow toolWindow) {
      c.setLayout(new BorderLayout());
      JBTabbedPane panel = (JBTabbedPane) c.add(new JBTabbedPane(JTabbedPane.TOP));
      panel.addTab("时间戳", timeParent(toolWindow.getProject()));
      panel.addTab("生成哈希", HashTool.createHashPanel(toolWindow.getProject()));
      panel.addTab("随机密码", new RandomPwd().getContainer());
      panel.addTab("JSON格式化", new JBLabel("test"));
      JBTabbedPane left = new JBTabbedPane(JTabbedPane.LEFT);
      panel.addTab("左边菜单", left);
      JPanel lp1 = new JPanel(new BorderLayout());
      lp1.add(new Samples().getContainer());
      left.addTab("测试1", lp1);
    }

    public JPanel getContentPanel() {
      return c;
    }

    private JPanel createTrPanel(String text,JTextField textField){
      JPanel panel = new JPanel();
      JLabel label = new JLabel(text);
      panel.add(label);
      panel.add(textField);
      return panel;
    }

    private static final String timeStr = "时间戳》》》时间格式化";

    private static final String dateStr = "时间格式化》》》时间戳";

    private static final ZonedBox zonedBox =new ZonedBox();

    private JPanel timeParent(Project project){
      long nowMil = System.currentTimeMillis();
      JPanel p = new JPanel();
      var time = new JPanel(new BorderLayout());
      time.add(createTimePanel(project,nowMil),BorderLayout.PAGE_START);
      time.add(createFormatPanel(project,nowMil),BorderLayout.PAGE_END);
      p.add(time);
      return p;
    }

    private JPanel createTimePanel(Project project,long nowMil){
      JPanel pTimePanel = new JPanel();
      pTimePanel.setLayout(new GridLayout(3, 1));
      // 下拉框
      pTimePanel.add(getZonedBox());
      pTimePanel.add(new JBLabel(timeStr));

      JPanel timePanel = new JPanel();
      timePanel.setBorder(BorderFactory.createLineBorder(JBColor.BLUE));
      timePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
      pTimePanel.add(timePanel);
      // 时间戳
      JTextField time = new JTextField(nowMil + "");
      time.setPreferredSize(new Dimension(120, 30));
      timePanel.add(createTrPanel("时间戳", time) );
      // 转换按钮
      JButton bt = new JButton("转换");
      LocalDateTime dateTime = LocalDateTime.now(ZoneOffset.of(zonedBox.getZoned()));
      JTextField timeFormat = new JTextField(dateTime.format(formatter));
      bt.addActionListener(e -> updateCurrentDateTime(project,time,timeFormat));
      timePanel.add(bt);
      //时间格式化
      timePanel.add(createTrPanel("时间", timeFormat));
      return pTimePanel;
    }


    private JPanel createFormatPanel(Project project,long nowMil){

      JTextField timeFormat = new JTextField( LocalDateTime.now(ZoneOffset.of(zonedBox.getZoned())).format(formatter));
      JTextField time = new JTextField(nowMil + "");
      JPanel pTimePanel = new JPanel();
//      pTimePanel.setBorder(BorderFactory.createLineBorder(JBColor.YELLOW));
      pTimePanel.setLayout(new GridLayout(3, 1));
      pTimePanel.add(new JBLabel(dateStr));
//      pTimePanel.add(getZonedBox());
      JPanel timePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
      timePanel.setBorder(BorderFactory.createLineBorder(JBColor.BLUE));
      pTimePanel.add(timePanel);
      //时间格式化
      timePanel.add(createTrPanel("时间", timeFormat));
      // 转换按钮
      JButton bt = new JButton("转换");
      bt.addActionListener(e -> updateTimeStamp(project,time,timeFormat));
      timePanel.add(bt);
      // 时间戳
      time.setPreferredSize(new Dimension(120, 30));
      timePanel.add(createTrPanel("时间戳", time) );
      return pTimePanel;
    }

    private void updateCurrentDateTime(Project project,JTextField time,JTextField timeFormat) {
      String rep = "^\\d{13}$";
      timeMsgLabel.setText("");
      if(!time.getText().isBlank() && Pattern.matches(rep, time.getText())){
        Instant instant = Instant.ofEpochMilli(Long.parseLong(time.getText()));
        LocalDateTime dateTime = LocalDateTime.ofInstant(instant, ZoneId.ofOffset("GMT", ZoneOffset.of(zonedBox.getZoned())));
        timeFormat.setText(dateTime.format(formatter));
      }else{
        Messages.showMessageDialog(project, "请输入正确的13位时间戳",
                "输入错误",
                Messages.getErrorIcon());
      }
    }

    private static final String dateStrRep = "^((([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|" +
            "((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|" +
            "((0[48]|[2468][048]|[3579][26])00))-02-29))" +
            "\\s([0-1][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])$";
    private void updateTimeStamp(Project project,JTextField time,JTextField timeFormat) {
      timeMsgLabel.setText("");
      if(!timeFormat.getText().isBlank() && Pattern.matches(dateStrRep, timeFormat.getText())){
        LocalDateTime now = LocalDateTime.parse(timeFormat.getText(), formatter);
        time.setText(now.toInstant(ZoneOffset.of(zonedBox.getZoned())).toEpochMilli()+"");
      }else{
        Messages.showMessageDialog(project, "请输入正确的格式：yyyy-MM-dd HH24:mm:ss",
                "输入错误",
                Messages.getErrorIcon());
      }
    }

    @NotNull
    private JPanel getZonedBox() {
      var comboboxPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
      comboboxPanel.add(new JBLabel("时区"));
      var comboBox = new ComboBox<>();
      comboBox.setPreferredSize(new Dimension(60, 30));
      for(int i=0;i<=12;i++){
        comboBox.addItem("+"+i);
      }
      for(int i=1;i<=12;i++){
        comboBox.addItem("-"+i);
      }
      comboBox.setSelectedItem(zonedBox.getZoned());
      comboBox.addItemListener(e->zonedBox.setZoned((String) e.getItem()));
      comboboxPanel.add(comboBox);
      return comboboxPanel;
    }
  }
}

