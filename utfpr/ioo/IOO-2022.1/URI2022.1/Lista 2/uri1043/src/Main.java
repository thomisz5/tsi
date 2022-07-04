import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceTexto it = new InterfaceTexto();
        it.executar();
    }
}

class InterfaceTexto {
    private Scanner scanner;
    private Triangulo triangulo;

    public InterfaceTexto() {
        scanner = new Scanner(System.in);
        triangulo = new Triangulo();
    }

    public void executar() {
        triangulo.setA(scanner.nextFloat());
        triangulo.setB(scanner.nextFloat());
        triangulo.setC(scanner.nextFloat());

        System.out.println(triangulo.getArea());
    }
}

class Triangulo {
    private float A, B, C;
    private float areaTrapezio;
    private float perimetroTriangulo;

    public void setA(float a) {
        A = a;
    }

    public void setB(float b) {
        B = b;
    }

    public void setC(float c) {
        C = c;
    }

    public String getArea() {
        if ((A < (B + C)) && (B < (A + C)) && (C < (B + A))) {
            perimetroTriangulo = A + B + C;
            return "Perimetro = " + perimetroTriangulo;
        } else
            areaTrapezio = ((A + B) * C) / 2;
        return "Area = " + areaTrapezio;
    }
}