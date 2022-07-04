import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceTexto i = new InterfaceTexto();
        i.executar();
    }
}

class InterfaceTexto {
    private Scanner scanner;
    private NumeroPrimo numeroPrimo;

    public InterfaceTexto() {
        scanner = new Scanner(System.in);
        numeroPrimo = new NumeroPrimo();
    }

    public void executar() {
        numeroPrimo.setN(scanner.nextInt());
        for (int i = 0; i < numeroPrimo.getN(); i++) {
            numeroPrimo.getCont();
            numeroPrimo.setX(scanner.nextInt());
            numeroPrimo.getPrimo();
        }
        if (numeroPrimo.getCont() == 0)
            System.out.println(numeroPrimo.getX() + " eh primo");
        else
            System.out.println(numeroPrimo.getX() + " nao eh primo");
    }
}

class NumeroPrimo {
    private int N, X;
    private int cont;

    public void setN(int n) {
        N = n;
    }

    public int getN() {
        return N;
    }

    public void setX(int x) {
        X = x;
    }

    public int getX() {
        return X;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public int getCont() {
        return 0;
    }

    public void getPrimo() {
        for (int j = 2; j < X; j++) {
            if (X % j == 0) cont++;
        }
    }
}