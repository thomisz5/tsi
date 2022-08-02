package model;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main petshop = new Main();
        petshop.inicia();
    }

    PetShop pet = new PetShop();

    public void inicia() {
        boolean test = true;
        Scanner scanner = new Scanner(System.in);
        while (test) {
            System.out.println("insira 1 para Gato, 2 para Dog e o nome");
            String nome = scanner.next();
            if (nome.equals("0")) {//comparação de strings equals
                test = false;
                break;
            }
            System.out.println("digite o nome do animal");
            String nomeAnimal = scanner.next();

             if (nome.equals("1")) {
                Animal gato = new Gato();
                gato.nome = nomeAnimal;
                pet.animais.add(gato);
            } else if (nome.equals("2")) {
                Animal dog = new Cão();
                dog.nome = nomeAnimal;
                pet.animais.add(dog);
            }
        }
        pet.listaAnimais();
    }
}
