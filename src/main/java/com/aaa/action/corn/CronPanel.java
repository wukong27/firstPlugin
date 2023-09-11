package com.aaa.action.corn;

import com.intellij.openapi.project.Project;
import com.intellij.ui.components.JBLabel;
import com.intellij.ui.components.JBTextArea;
import com.intellij.ui.components.JBTextField;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

public class CronPanel {

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public JPanel createCornPanel(Project project){
        JPanel parent = new JPanel(new GridLayout(3,1));
        //corn表达式
        parent.add(cornInput());
        //按钮
        //输出
        return parent;
    }

    private JBTextField input = new JBTextField("请输入...");
    private JPanel cornInput(){
        JPanel panel = new JPanel();
        panel.add(new JBLabel("Your corn:"));
        input.setPreferredSize(new Dimension(100, 30));
        panel.add(input);
        return panel;
    }

    private JPanel bt(){
        JPanel panel = new JPanel();
        Button bt = new Button("Test Corn");
        bt.addActionListener(e->{
            var text = input.getText();
            if(!CronUtils.isValid(text)){
                area.setText("corn error!");
            }
            List<Date> dates = CronUtils.getNextNExecution(text, 5);
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            StringBuilder sb = new StringBuilder();
            for(Date date: dates ){
                sb.append(format.format(date)).append("\n");

            }

        });
        panel.add(bt);
        return panel;
    }

    private static final JBTextArea area = new JBTextArea();
    private JPanel output(){
        JPanel panel = new JPanel();
        panel.add(area);
        area.setText("结果");
        return panel;
    }


}
