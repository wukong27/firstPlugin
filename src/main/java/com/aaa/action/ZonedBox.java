package com.aaa.action;

import com.intellij.openapi.ui.ComboBox;
import com.intellij.ui.components.JBLabel;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;

public class ZonedBox {

    private String zoned = "+8";

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
        comboBox.setSelectedItem(zoned);
        comboBox.addItemListener(e->zoned=(String) e.getItem());
        comboboxPanel.add(comboBox);
        return comboboxPanel;
    }

    public String getZoned(){
        return zoned;
    }

    public void setZoned(String zoned){
        this.zoned = zoned;
    }
}
