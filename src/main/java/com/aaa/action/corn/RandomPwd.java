package com.aaa.action.corn;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class RandomPwd {
    private JButton pwdButton;
    private JComboBox comboBox1;
    private JTextArea yourPasswordTextArea;
    private JRadioButton aZRadioButton;
    private JRadioButton aZRadioButton2;
    private JRadioButton supRadioButton;
    private JRadioButton a09RadioButton;
    private JComboBox comboBox2;
    private JButton copyPwd;
    private JPanel container;

    public static void main(String[] args) {
        JFrame frame = new JFrame("RandomPwd");
        frame.setContentPane(new RandomPwd().container);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
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
        container.setLayout(new GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));
        container.setEnabled(false);
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(5, 1, new Insets(0, 0, 0, 0), -1, -1));
        container.add(panel1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        panel1.add(panel2, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JLabel label1 = new JLabel();
        label1.setText("长度");
        panel2.add(label1);
        comboBox2 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel1 = new DefaultComboBoxModel();
        defaultComboBoxModel1.addElement("3");
        defaultComboBoxModel1.addElement("4");
        defaultComboBoxModel1.addElement("5");
        defaultComboBoxModel1.addElement("6");
        defaultComboBoxModel1.addElement("7");
        defaultComboBoxModel1.addElement("8");
        defaultComboBoxModel1.addElement("9");
        defaultComboBoxModel1.addElement("10");
        defaultComboBoxModel1.addElement("11");
        defaultComboBoxModel1.addElement("12");
        defaultComboBoxModel1.addElement("13");
        defaultComboBoxModel1.addElement("14");
        defaultComboBoxModel1.addElement("15");
        defaultComboBoxModel1.addElement("16");
        defaultComboBoxModel1.addElement("17");
        defaultComboBoxModel1.addElement("18");
        defaultComboBoxModel1.addElement("19");
        defaultComboBoxModel1.addElement("20");
        defaultComboBoxModel1.addElement("21");
        defaultComboBoxModel1.addElement("22");
        defaultComboBoxModel1.addElement("23");
        defaultComboBoxModel1.addElement("24");
        defaultComboBoxModel1.addElement("25");
        defaultComboBoxModel1.addElement("26");
        defaultComboBoxModel1.addElement("27");
        defaultComboBoxModel1.addElement("28");
        defaultComboBoxModel1.addElement("29");
        defaultComboBoxModel1.addElement("30");
        defaultComboBoxModel1.addElement("31");
        defaultComboBoxModel1.addElement("32");
        defaultComboBoxModel1.addElement("33");
        defaultComboBoxModel1.addElement("34");
        defaultComboBoxModel1.addElement("35");
        defaultComboBoxModel1.addElement("36");
        defaultComboBoxModel1.addElement("37");
        defaultComboBoxModel1.addElement("38");
        defaultComboBoxModel1.addElement("39");
        defaultComboBoxModel1.addElement("40");
        comboBox2.setModel(defaultComboBoxModel1);
        panel2.add(comboBox2);
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        panel1.add(panel3, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        a09RadioButton = new JRadioButton();
        a09RadioButton.setEnabled(false);
        a09RadioButton.setSelected(true);
        a09RadioButton.setText("0-9");
        panel3.add(a09RadioButton);
        aZRadioButton = new JRadioButton();
        aZRadioButton.setText("a-z");
        panel3.add(aZRadioButton);
        aZRadioButton2 = new JRadioButton();
        aZRadioButton2.setText("A-Z");
        panel3.add(aZRadioButton2);
        supRadioButton = new JRadioButton();
        supRadioButton.setText("特殊字符");
        panel3.add(supRadioButton);
        final JPanel panel4 = new JPanel();
        panel4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        panel1.add(panel4, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        pwdButton = new JButton();
        pwdButton.setText("生成密码");
        panel4.add(pwdButton);
        copyPwd = new JButton();
        copyPwd.setText("复制密码");
        panel4.add(copyPwd);
        final JScrollPane scrollPane1 = new JScrollPane();
        panel1.add(scrollPane1, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, new Dimension(300, 150), new Dimension(300, 150), new Dimension(300, 150), 0, false));
        scrollPane1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        yourPasswordTextArea = new JTextArea();
        yourPasswordTextArea.setBackground(new Color(-4851457));
        yourPasswordTextArea.setColumns(10);
        yourPasswordTextArea.setText("your password");
        scrollPane1.setViewportView(yourPasswordTextArea);
        final JPanel panel5 = new JPanel();
        panel5.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        panel1.add(panel5, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setText("类型");
        panel5.add(label2);
        comboBox1 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel2 = new DefaultComboBoxModel();
        defaultComboBoxModel2.addElement("随机密码");
        defaultComboBoxModel2.addElement("易记密码");
        defaultComboBoxModel2.addElement("PIN");
        comboBox1.setModel(defaultComboBoxModel2);
        panel5.add(comboBox1);
        final Spacer spacer1 = new Spacer();
        container.add(spacer1, new GridConstraints(0, 1, 2, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer2 = new Spacer();
        container.add(spacer2, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return container;
    }

}