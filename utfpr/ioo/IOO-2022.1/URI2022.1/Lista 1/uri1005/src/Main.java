
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceTexto it = new InterfaceTexto();
        it.executar();
    }
}

class InterfaceTexto {
    private Scanner scaner;
    private Media media;

    public InterfaceTexto() {
        scaner = new Scanner(System.in);
        media = new Media();
    }

    public void executar() {
        media.setNotaA(scaner.nextDouble());
        media.setNotaB(scaner.nextDouble());

        System.out.printf("MEDIA = %.5f%n", media.getMediaPonderada());
    }
}

class Media {
    private double notaA;
    private double notaB;
    private double pesoA;
    private double pesoB;

    public Media() {
        pesoA = 3.5;
        pesoB = 7.5;
    }

    public void setNotaA(double notaA) {
        this.notaA = notaA;
    }

    public void setNotaB(double notaB) {
        this.notaB = notaB;
    }

    public double getMediaPonderada() {
        return (notaA * pesoA + notaB * pesoB) /
                (pesoA + pesoB);
    }

}




