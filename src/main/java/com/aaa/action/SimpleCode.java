package com.aaa.action;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class SimpleCode {
    private JPanel container;
    private JTextField textField1;
    private JButton button1;
    private JTextPane textPane1;
    private JList list1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("SimpleCode");
        frame.setContentPane(new SimpleCode().container);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
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
        container.setLayout(new FlowLayout());
        container.setMaximumSize(new Dimension(-1, -1));
        container.setMinimumSize(new Dimension(-1, -1));
        container.setPreferredSize(new Dimension(800, -1));
        container.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        container.add(panel1, BorderLayout.NORTH);
        textField1 = new JTextField();
        textField1.setPreferredSize(new Dimension(200, 40));
        panel1.add(textField1);
        button1 = new JButton();
        button1.setText("Button");
        panel1.add(button1);
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        panel2.setPreferredSize(new Dimension(200, 90));
        container.add(panel2, BorderLayout.WEST);
        panel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(-16777216)), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        list1 = new JList();
        final DefaultListModel defaultListModel1 = new DefaultListModel();
        defaultListModel1.addElement("示例代码：base64转换");
        defaultListModel1.addElement("示例代码：base64转换");
        defaultListModel1.addElement("示例代码：base64转换");
        defaultListModel1.addElement("示例代码：base64转换");
        defaultListModel1.addElement("示例代码：base64转换");
        defaultListModel1.addElement("示例代码：base64转换");
        defaultListModel1.addElement("示例代码：base64转换");
        defaultListModel1.addElement("示例代码：base64转换");
        defaultListModel1.addElement("示例代码：base64转换");
        defaultListModel1.addElement("示例代码：base64转换");
        defaultListModel1.addElement("示例代码：base64转换");
        defaultListModel1.addElement("示例代码：base64转换");
        defaultListModel1.addElement("示例代码：base64转换");
        list1.setModel(defaultListModel1);
        panel2.add(list1);
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        container.add(panel3, BorderLayout.CENTER);
        panel3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(-16777216)), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        textPane1 = new JTextPane();
        textPane1.setText("");
        panel3.add(textPane1);
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
}