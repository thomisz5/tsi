import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceTexto it = new InterfaceTexto();
        it.executar();
    }
}

class InterfaceTexto {
    private Scanner scanner;
    private Distancia distancia;

    public InterfaceTexto() {
        scanner = new Scanner(System.in);
        distancia = new Distancia();
    }

    public void executar() {
        distancia.setX1(scanner.nextDouble());
        distancia.setY1(scanner.nextDouble());
        distancia.setX2(scanner.nextDouble());
        distancia.setY2(scanner.nextDouble());

        System.out.printf("%.4f\n", distancia.getDistancia());

    }
}

class Distancia {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double distancia;

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double getDistancia() {
        return distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}
