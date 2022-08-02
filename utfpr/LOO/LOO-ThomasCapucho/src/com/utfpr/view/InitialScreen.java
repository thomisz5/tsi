package com.utfpr.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InitialScreen extends JPanel implements VisualWindow {

    private FrameBase fBase;
    private JButton btOK;
    private JTextField textField;
    private String in_Register;


    public InitialScreen(FrameBase fBase) {
        this.fBase = fBase;
        setLayouts();
        setComponents();
        setEvents();
    }

    public String getIn_Register() {
        return in_Register;
    }

    public void setIn_Register(String in_Register) {
        this.in_Register = in_Register;
    }

    @Override
    public void setLayouts() {
        setLayout(new FlowLayout());
        setVisible(true);
        setBackground(Color.GRAY);
    }

    @Override
    public void setComponents() {
        btOK = new JButton("OK");
        btOK.setBounds(10,10,50,30);
        textField = new JTextField();
        add(btOK);
        add(textField);
    }

    @Override
    public void setEvents() {
        btOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                in_Register = textField.getText();
            }
        });
    }
}
