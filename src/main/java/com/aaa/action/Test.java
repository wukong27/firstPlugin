package com.aaa.action;

import com.intellij.openapi.ui.ComboBox;

import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.awt.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Test {

    public static void main(String[] args) {
        //创建一个窗口，创建一个窗口
        MyFrame frame = new MyFrame("SwingDemo!");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗口大小
        frame.setSize(600, 300);

        //显示窗口
        frame.setVisible(true);


    }


}

class MyFrame extends JFrame{

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public String zoned = "+8";


    public MyFrame(String title){
        //继承父类，
        super(title);

//        Container c =getContentPane();// 添加容器
//        c.setLayout(new GridLayout(6,4,10,8));// (行数，列数，水平间距，竖直间距)；单位：像素

//        this.setLayout(new GridLayout(6,4,10,8));
        this.setLayout(new GridLayout(6,4,10,8));
        JPanel contentPanel = new JPanel();
//        contentPanel.setBorder(BorderFactory.createEmptyBorder(40, 0, 0, 0));

        this.add(contentPanel);
        // 时间戳
        JTextField time = new JTextField(System.currentTimeMillis() + "");
        contentPanel.add(createTrPanel("时间戳", time) );
        // 下拉框
        JPanel comboboxPanel = new JPanel();
        comboboxPanel.add(new JLabel("时区"));
        JComboBox<String> comboBox = new JComboBox<>();
        for(int i=0;i<=12;i++){
            comboBox.addItem("+"+i);
        }
        for(int i=1;i<=12;i++){
            comboBox.addItem("-"+i);
        }
        comboBox.setSelectedItem(zoned);
        comboBox.addItemListener(e->zoned=(String) e.getItem());
        comboboxPanel.add(comboBox);
        contentPanel.add(comboboxPanel);
        // 转换按钮
        JButton bt = new JButton("转换");
//        contentPanel.add(bt,BorderLayout.PAGE_END);
        contentPanel.add(bt);

        //时间格式化
        var dateTime = LocalDateTime.now(ZoneOffset.of("+8"));
        var timeFormat = new JTextField(dateTime.format(formatter));
        contentPanel.add(createTrPanel("时间(北京时间)", timeFormat));
        bt.addActionListener(e -> updateCurrentDateTime(time,timeFormat));

    }

    private JPanel createTrPanel(String text,JTextField textField){
        JPanel panel = new JPanel();
        JLabel label = new JLabel(text);
        panel.add(label);
        panel.add(textField);
        return panel;
    }

    private void updateCurrentDateTime(JTextField time,JTextField timeFormat) {
        String text = time.getText();
        if(!text.isBlank()){
            Instant instant = Instant.ofEpochMilli(Long.parseLong(text));
            LocalDateTime dateTime = LocalDateTime.ofInstant(instant, ZoneId.ofOffset("GMT", ZoneOffset.of(zoned)));
            timeFormat.setText(dateTime.format(formatter));
        }
    }
}
