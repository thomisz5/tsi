
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main consessionaria = new Main();
        consessionaria.start();
    }

    Concessionaria cars = new Concessionaria();

    public void start() {

        String[] carros = {"sedan", "popular", "suv"};
        System.out.println("Insira o modelo do carro: 1-Sedan \n 2-Popular \n 3-SUV");
        Scanner scanner = new Scanner(System.in);
        int tipoCarro = scanner.nextInt();

        switch (tipoCarro) {
            case 1:
                System.out.println(carros[0]);
                Sedan sedan = new Sedan();
                System.out.println(sedan.modelo);
                System.out.println(sedan.ano);
                System.out.println(sedan.motor);
                System.out.println(sedan.preco);
                System.out.println(sedan.cor);
                break;
            case 2:
                System.out.println(carros[1]);
                Popular pop = new Popular();
                System.out.println(pop.modelo);
                System.out.println(pop.ano);
                System.out.println(pop.motor);
                System.out.println(pop.preco);
                System.out.println(pop.cor);
                break;
            case 3:
                System.out.println(carros[2]);
                SUV suv = new SUV();
                System.out.println(suv.modelo);
                System.out.println(suv.ano);
                System.out.println(suv.motor);
                System.out.println(suv.preco);
                System.out.println(suv.cor);
            default:
                System.out.println("nenhum numero conhecido informado ");
                break;
        }
        cars.listaCarros();
    }
}
