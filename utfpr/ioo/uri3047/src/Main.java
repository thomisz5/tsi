import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceTexto it = new InterfaceTexto();
        it.executar();
    }
}

class InterfaceTexto {
    private Scanner scanner;
    private Idade idade;

    public InterfaceTexto() {
        scanner = new Scanner(System.in);
        idade = new Idade();
    }

    public void executar() {
        idade.setM(scanner.nextInt());
        idade.setA(scanner.nextInt());
        idade.setB(scanner.nextInt());

        System.out.println(idade.getIdade());
    }
}

class Idade {
    private int m, a, b;
    private int x = m - a - b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getIdade() {
        if (m > a && x > b) {
            return x;
        } else if (a > b && a > x) {
            return a;
        }
            return b;

    }
}

