package com.utfpr.view;

import javax.swing.*;
import javax.swing.plaf.SplitPaneUI;
import java.awt.*;


public class ThirdScreen extends JPanel implements VisualWindow {

    private FrameBase fBase;
    private JTextField jTextField;
    private JLabel jLabel;
    private JScrollPane scrollPane;
    private JButton jButton;
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonProximo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelGeral;
    private javax.swing.JPanel jPanelObservacao;
    private javax.swing.JPanel jPanelPessoal;
    private javax.swing.JPanel jPanelProfissional;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPaneContainer;
    private javax.swing.JTextArea jTextAreaObservacao;
    private javax.swing.JTextField jTextFieldCargo;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldTipoSanguineo;

    public ThirdScreen(FrameBase fBase) {
        this.fBase = fBase;
        setLayouts();
        setComponents();
        setEvents();
    }

    @Override
    public void setLayouts() {
        setLayout(new FlowLayout());
        setVisible(true);
        setBackground(Color.MAGENTA);
    }

    @Override
    public void setComponents() {
        jTabbedPaneContainer = new JTabbedPane();
        jPanelGeral = new JPanel();
    }

    @Override
    public void setEvents() {

    }
}

