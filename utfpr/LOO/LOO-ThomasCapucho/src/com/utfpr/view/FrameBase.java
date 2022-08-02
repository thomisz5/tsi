package com.utfpr.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameBase extends JFrame implements VisualWindow {

    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem item1, item2,item3;
    private PanelBase baseJP;
    private CardLayout cl;

    public FrameBase() {
        setLayouts();
        setComponents();
        setEvents();
        repaint(); //?
    }

    @Override
    public void setLayouts() {
        setSize(1980, 1080);
        setVisible(true);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void setComponents() {
        menuBar = new JMenuBar();
        menu = new JMenu("Opções");
        item1 = new JMenuItem("Opção 1");
        item2 = new JMenuItem("Opção 2");
        item3 = new JMenuItem("Opção 3");

        menu.add(item1);
        menu.add(item2);
        menu.add(item3);
        menuBar.add(menu);

        baseJP = new PanelBase(this);

        add(menuBar, BorderLayout.NORTH);
        add(baseJP, BorderLayout.CENTER);
        cl = new CardLayout();
        cl = (CardLayout) baseJP.getLayout();
    }

    @Override
    public void setEvents() {
        item1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(baseJP, "inital");
                repaintAll();
            }
        });
        item2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(baseJP, "second");
            }
        });
        item3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(baseJP, "third");
                Warnings.showWarning();
            }
        });
    }

    private void repaintAll() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                repaint();
            }
        });
    }

}
