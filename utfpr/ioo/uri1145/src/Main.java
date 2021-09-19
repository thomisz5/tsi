import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceTexto it = new InterfaceTexto();
        it.executar();
    }
}

class InterfaceTexto {
    private Scanner scanner;
    private Sequencia sequencia;

    public InterfaceTexto() {
        scanner = new Scanner(System.in);
        sequencia = new Sequencia();
    }

    public void executar() {
        sequencia.setX(scanner.nextInt());
        sequencia.setY(scanner.nextInt());
        int cont = 1;

        for (int i = 1; i <= sequencia.getY(); i++) {
            System.out.print(i);

            if(cont == sequencia.getX()){
                System.out.println();
                cont = 1;
            }else{
                System.out.print(" ");
                cont++;
            }
        }
    }
}

class Sequencia {
    private int X, Y;

    public void setX(int x) {
        this.X = x;
    }

    public void setY(int y) {
        this.Y = y;
    }

    public int getY() {
        return Y;
    }

    public int getX() {
        return X;
    }
}