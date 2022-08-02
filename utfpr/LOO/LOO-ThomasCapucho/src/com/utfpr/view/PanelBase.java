package com.utfpr.view;

import javax.swing.*;
import java.awt.*;

public class PanelBase extends JPanel implements VisualWindow {
    private FrameBase frameBase;
    private InitialScreen initalJP;
    private SecondScreen secondJP;
    private ThirdScreen thirdJP;


    public PanelBase(FrameBase frameBase) {
        this.frameBase = frameBase;
        setLayouts();
        setComponents();
        setEvents();
    }

    @Override
    public void setLayouts() {
        setLayout(new CardLayout());
        setSize(800, 550);
        setVisible(true);

    }

    @Override
    public void setComponents() {
        initalJP = new InitialScreen(frameBase);
        secondJP = new SecondScreen(frameBase);
        thirdJP = new ThirdScreen(frameBase);

        add(initalJP, "initial");
        add(secondJP, "second");
        add(thirdJP, "third");
    }

    @Override
    public void setEvents() {

    }
}
