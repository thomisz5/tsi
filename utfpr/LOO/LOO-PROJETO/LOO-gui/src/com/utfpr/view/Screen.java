package com.utfpr.view;

import com.utfpr.model.Person;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Screen extends JFrame {
    //Componentes do Formulário Person--------------------
    private JPanel panelTop;
    private JPanel panelLeft;
    private JPanel panelRight;
    private JList listPeople;
    private JButton btnNew;
    private JButton btnSave;
    private JTextField textNome;
    private JTextField textEmail;
    private JTextField textNumero;
    private JTextField textData;
    private JPanel panelMain;
    //-------------add PERSON--------------
    private ArrayList<Person> pessoa;
    private DefaultListModel listPeopleModel;

    //CONSTRUTOR
    public Screen() {
        super("LOO - Contatos");
        this.setContentPane(this.panelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        pessoa = new ArrayList<Person>();//inicializando no construtor
        listPeopleModel = new DefaultListModel();
        listPeople.setModel(listPeopleModel);

        //eventListener do BTNNEW
        btnNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        //eventListener do BTNSAVE
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        //eventListener da LISTAGEM
        listPeople.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

            }
        });
    }

    public void refreshPeopleList() {
        listPeopleModel.removeAllElements();
        System.out.println("Removendo todas as pessoas da lista");
        for (Person p : pessoa) {//percorrendo minha arrayList 'pessoa'
            System.out.println("Adicionando pessoa na lista: " + p.getName());
            listPeopleModel.addElement(p.getDate());

        }
    }
    //----METODO para ADD PESSOA-------(fora do construtor)

    public void addPerson(Person p) {//toda vez que eu add uma pessoa, eu 'refresh' minha lista, excluindo e adiconando
        pessoa.add(p);
        refreshPeopleList();
    }

}
