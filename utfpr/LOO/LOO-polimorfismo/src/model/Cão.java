package model;

public class Cão extends Animal{

    @Override//sobreescrita do método da classe mãe
    public void ataca() {
        System.out.println("Ataque canino!");
    }
}
