package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaBase extends JFrame implements Telas {
    JFrame frame;
    JPanel panel;
    JButton button;
    JTextField textField;


    @Override
    public void setAll() {
        setComponents();
        setActions();
    }

    @Override
    public void setComponents() {
        frame = new JFrame("Tela básica");
        frame.setSize(800, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        panel = new JPanel(null);
        panel.setBackground(Color.PINK);
        panel.setSize(800, 600);
        panel.setVisible(true);
        button = new JButton("OK");
        panel.add(button);
        button.setBounds(10, 20, 100, 35);
        button.setVisible(true);
        frame.add(panel);

        textField = new JTextField();
        textField.setBounds(120,20,250,35);
        panel.add(textField);

    }

    @Override
    public void setActions() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String entrada = textField.getText();
                System.out.println(entrada);
                System.out.println("botão okk");
            }
        });
    }
}
