package com.utfpr.view;

import javax.swing.*;
import java.awt.*;


public class SecondScreen extends JPanel implements VisualWindow {

    private FrameBase fBase;

    public SecondScreen(FrameBase fBase) {
        this.fBase = fBase;
        setLayouts();
        setComponents();
        setEvents();
    }

    @Override
    public void setLayouts() {
        setLayout(new FlowLayout());
        setVisible(true);
        setBackground(Color.YELLOW);
    }

    @Override
    public void setComponents() {

    }

    @Override
    public void setEvents() {

    }
}

