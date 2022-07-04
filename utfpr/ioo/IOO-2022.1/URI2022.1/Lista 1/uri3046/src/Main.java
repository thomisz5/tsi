import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceTexto it = new InterfaceTexto();
        it.executar();
    }
}

class InterfaceTexto {
    private Scanner scanner;
    private Domino domino;

    public InterfaceTexto() {
        scanner = new Scanner(System.in);
        domino = new Domino();
    }

    public void executar() {
        domino.setN(scanner.nextInt());

        System.out.println(domino.getDomino());
    }
}

class Domino {
    private int n;

    public void setN(int n) {
        this.n = n;
    }

    public int getDomino() {
        return (((n + 1) * (n + 2)) / 2);
    }

}
