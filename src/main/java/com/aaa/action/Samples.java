package com.aaa.action;

import com.intellij.openapi.util.text.StringUtil;
import com.intellij.ui.components.JBList;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class Samples{
    private JPanel container;
    private JTextField textField1;
    private JButton searchButton;
    private JTextPane areaTextPane;
    private JList<String> sampleList;
    private java.util.List<String> samples=new ArrayList<>();

    public Samples(){
        initSample();
        $$$setupUI$$$();
        searchButton.addActionListener(this::btLsn);
        sampleList.addListSelectionListener(this::selectLsn);
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        container = new JPanel();
        container.setLayout(new BorderLayout(0, 0));
        container.setMaximumSize(new Dimension(800, 800));
        container.setMinimumSize(new Dimension(300, 300));
        container.setPreferredSize(new Dimension(400, 400));
        container.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        panel1.setPreferredSize(new Dimension(200, 50));
        container.add(panel1, BorderLayout.NORTH);
        textField1 = new JTextField();
        textField1.setPreferredSize(new Dimension(200, 40));
        panel1.add(textField1);
        searchButton = new JButton();
        searchButton.setHideActionText(true);
        searchButton.setMaximumSize(new Dimension(78, 40));
        searchButton.setMinimumSize(new Dimension(78, 40));
        searchButton.setPreferredSize(new Dimension(78, 40));
        searchButton.setText("search");
        panel1.add(searchButton);
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        panel2.setPreferredSize(new Dimension(200, 90));
        container.add(panel2, BorderLayout.WEST);
        panel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(-16777216)), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        sampleList = new JBList<>();
        DefaultListModel  defaultListModel1 = new DefaultListModel();
        for(String str:samples){
            defaultListModel1.addElement(str);
        }
        sampleList.setModel(defaultListModel1);
        panel2.add(sampleList);
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        panel3.setEnabled(true);
        panel3.setRequestFocusEnabled(false);
        container.add(panel3, BorderLayout.CENTER);
        panel3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(-16777216)), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        areaTextPane = new JTextPane();
        areaTextPane.setContentType("text/plain");
        areaTextPane.setEditable(false);
        areaTextPane.setText("fdasea\natet");
        panel3.add(areaTextPane);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return container;
    }

    public JPanel getContainer() {
        return container;
    }

    private void btLsn(ActionEvent actionEvent){
        String text = textField1.getText();
        if(!StringUtil.isEmpty(text)){
            DefaultListModel<String> listModel = new DefaultListModel<>();
            // 搜索匹配
            samples.stream().filter(s->s.contains(text)).forEach(listModel::addElement);
            sampleList.setModel(listModel);
        }
    }

    private void initSample(){
        samples.add("示例代码：base64转换");
        samples.add("示例代码：hashcode");
        samples.add("示例代码：随机密码");
        samples.add("示例代码：RAS非对称加密");
        samples.add("示例代码：EAS对称加密");
        samples.add("示例代码：URL编码");
    }


    private void selectLsn(ListSelectionEvent e){
        if(e.getValueIsAdjusting()){
            int idx = sampleList.getLeadSelectionIndex();
            ListModel<String> model = sampleList.getModel();
            String item = model.getElementAt(idx);
            areaTextPane.setText(item);
            System.out.println(item);
        }
    }
}
