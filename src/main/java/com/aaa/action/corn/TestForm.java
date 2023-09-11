/*
 * Created by JFormDesigner on Thu Sep 07 12:35:38 CST 2023
 */

package com.aaa.action.corn;

import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author Administrator
 */
public class TestForm extends JPanel {
    public TestForm() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - zy Lee
        tabbedPane1 = new JTabbedPane();
        tabbedPane2 = new JTabbedPane();
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        tabbedPane3 = new JTabbedPane();
        tabbedPane4 = new JTabbedPane();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax
        . swing. border. EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing
        . border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .
        Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt. Color. red
        ) , getBorder( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override
        public void propertyChange (java .beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .getPropertyName (
        ) )) throw new RuntimeException( ); }} );
        setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //======== tabbedPane1 ========
        {
            tabbedPane1.setBackground(new Color(0xcccccc));

            //======== tabbedPane2 ========
            {
                tabbedPane2.setTabPlacement(SwingConstants.LEFT);
                tabbedPane2.setBackground(new Color(0xccccff));

                //======== panel1 ========
                {
                    panel1.setLayout(new FlowLayout());
                }
                tabbedPane2.addTab("m1", panel1);

                //======== panel2 ========
                {
                    panel2.setLayout(new FlowLayout());
                }
                tabbedPane2.addTab("m2", panel2);

                //======== panel3 ========
                {
                    panel3.setLayout(new FlowLayout());
                }
                tabbedPane2.addTab("m3", panel3);
            }
            tabbedPane1.addTab("\u83dc\u5355\u4e00", tabbedPane2);
            tabbedPane1.addTab("\u83dc\u5355\u4e8c", tabbedPane3);
            tabbedPane1.addTab("\u83dc\u5355\u4e09", tabbedPane4);
        }
        add(tabbedPane1, "cell 0 0");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - zy Lee
    private JTabbedPane tabbedPane1;
    private JTabbedPane tabbedPane2;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JTabbedPane tabbedPane3;
    private JTabbedPane tabbedPane4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
