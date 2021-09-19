import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceTexo it = new InterfaceTexo();
        it.executar();
    }
}

class InterfaceTexo {
    private Scanner scanner;
    private Media media;

    public InterfaceTexo() {
        scanner = new Scanner(System.in);
        media = new Media();
    }

    public void executar() {
        media.setNotaA(scanner.nextDouble());
        media.setNotaB(scanner.nextDouble());
        media.setNotaC(scanner.nextDouble());

        System.out.printf("MEDIA = %.1f\n", media.getMedia());
    }
}

class Media {
    private double notaA;
    private double notaB;
    private double notaC;
    private double media;


    public void setNotaA(double notaA) {
        this.notaA = notaA;
    }

    public void setNotaB(double notaB) {
        this.notaB = notaB;
    }

    public void setNotaC(double notaC) {
        this.notaC = notaC;
    }

    public double getMedia() {
        return media= (notaA * 2 + notaB * 3 + notaC * 5) / 10;
    }
}