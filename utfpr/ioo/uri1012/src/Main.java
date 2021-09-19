import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceTexto it = new InterfaceTexto();
        it.executar();
    }
}

class InterfaceTexto {
    private Scanner scanner;
    private Area area;

    public InterfaceTexto() {
        scanner = new Scanner(System.in);
        area = new Area();
    }

    public void executar() {
        area.setA(scanner.nextDouble());
        area.setB(scanner.nextDouble());
        area.setC(scanner.nextDouble());

        System.out.printf("TRIANGULO: %.3f\n", area.getTriangulo());
        System.out.printf("CIRCULO: %.3f\n", area.getCirculo());
        System.out.printf("TRAPEZIO: %.3f\n", area.getTrapezio());
        System.out.printf("QUADRADO: %.3f\n", area.getQuadrado());
        System.out.printf("RETANGULO: %.3f\n", area.getRetangulo());

    }
}

class Area {
    private double a, b, c;
    private double triangulo;
    private double circulo;
    private double trapezio;
    private double quadrado;
    private double retangulo;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getTriangulo() {
        return triangulo = a * c / 2.0;
    }

    public double getCirculo() {
        return circulo = 3.14159 * (c * c);
    }

    public double getTrapezio() {
        return trapezio = ((a + b) * c) / 2;
    }

    public double getQuadrado() {
        return quadrado = b * b;
    }

    public double getRetangulo() {
        return retangulo = a * b;
    }
}
