package com.utfpr.util;

import com.utfpr.model.Person;
import com.utfpr.view.Screen;

public class App {
    public static void main(String[] args) {
        Screen screen = new Screen();
        screen.setVisible(true);


        Person milico = new Person("milico", "milico@yahoo.com", "999888999", "15/09/2003");
        Person lucas = new Person("lucas", "lucas@gmail.com", "4298890299", "15/09/2005");
        Person john = new Person("john", "john@outlook.com", "242423333", "15/09/1998");
        Person thomas = new Person("thomas", "thomascapucho@email.com", "99999999", "15/09/2002");
        Person enrico = new Person("enrico", "enrico@email.com", "98998882", "15/09/2000");

        screen.addPerson(milico);
        screen.addPerson(lucas);
        screen.addPerson(john);
        screen.addPerson(thomas);
        screen.addPerson(enrico);
    }


}
