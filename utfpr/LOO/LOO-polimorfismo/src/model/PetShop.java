package model;
import java.util.ArrayList;

public class PetShop {

    ArrayList<Animal> animais = new ArrayList<>();//inserção de varios objetos do tipo animal

    public void novoAnimal(Animal animal) {
        animais.add(animal);
    }

    public void listaAnimais() {
        for (int i = 0; i < animais.size(); i++) {
            System.out.println(animais.get(i).nome);//vai pegar o animal na posicao i
        }

    }
}
