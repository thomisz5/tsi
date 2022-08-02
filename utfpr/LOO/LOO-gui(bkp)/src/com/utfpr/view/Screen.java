package com.utfpr.view;

import com.utfpr.model.Person;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

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
    private JLabel labelAno;
    private JLabel labelIdade;
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
        btnSave.setEnabled(false);

        //eventListener do BTNNEW
        btnNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnNewClick(e);
            }
        });

        //eventListener do BTNSAVE
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnSaveClick(e);
            }
        });

        //eventListener da LISTAGEM
        listPeople.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
              listPeopleSelection(e);
            }
        });
    }

    public void btnNewClick(ActionEvent e) {
        Person p = new Person(
                textNome.getText(),
                textEmail.getText(),
                textNumero.getText(),
                textData.getText()
        );
        pessoa.add(p);
        refreshPeopleList();
    }

    public void btnSaveClick(ActionEvent e) {
        int personNumber = listPeople.getSelectedIndex();
        if (personNumber >= 0) {
            Person p = pessoa.get(personNumber);
            p.setName(textNome.getText());
            p.setEmail(textEmail.getText());
            p.setPhone(textNumero.getText());
            p.setDataNascimento(textData.getText());
            refreshPeopleList();
        }
    }

    public void listPeopleSelection(ListSelectionEvent e) {
        int personNumber = listPeople.getSelectedIndex(); //pego o index do item da lista
        if (personNumber >= 0) {
            Person p = pessoa.get(personNumber);
            textNome.setText(p.getName());
            textEmail.setText(p.getEmail());
            textNumero.setText(p.getPhone());
            textData.setText(p.getDataNascimento().format(DateTimeFormatter.ofPattern("dd/mm/yyyy")));
            labelIdade.setText(Integer.toString(p.getIdade()) + " years");
            btnSave.setEnabled(true);
        } else {
            btnSave.setEnabled(false);
        }
    }

    public void refreshPeopleList() {
        listPeopleModel.removeAllElements();
        System.out.println("Removendo todas as pessoas da lista");
        for (Person p : pessoa) {//percorrendo minha arrayList 'pessoa'
            System.out.println("Adicionando pessoa na lista: " + p.getName());
            listPeopleModel.addElement(p.getName());

        }
    }

    //----METODO para ADD PESSOA-------(fora do construtor)
    public void addPerson(Person p) {//toda vez que eu add uma pessoa, eu 'atualizo' minha lista, excluindo e adiconando
        pessoa.add(p);
        refreshPeopleList();
    }
}
