//thomas sá capucho a2256576
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceTexto it = new InterfaceTexto();
        it.executar();
    }
}

class InterfaceTexto {
    private Scanner scanner;
    private JogoMatematico jogoMatematico;

    public InterfaceTexto() {
        scanner = new Scanner(System.in);
        jogoMatematico = new JogoMatematico();
    }

    public void executar() {
        jogoMatematico.setN(scanner.nextInt());
        for (int i = 0; i < jogoMatematico.getN(); i++) {
            jogoMatematico.setLinha(scanner.next());
            jogoMatematico.defineCaracteres();
            System.out.println(jogoMatematico.calculaJogo());
        }
    }
}

class JogoMatematico {
    private int N, x, y;
    private char z;
    private String linha;

    public void defineCaracteres() {
        x = Character.getNumericValue(linha.charAt(0));
        z = linha.charAt(1);
        y = Character.getNumericValue(linha.charAt(2));
    }

    public int calculaJogo() {
        if (x == y) {
            return x + y;
        } else if (Character.isUpperCase(z)) {
            return y - x;
        } else {
            return x + y;
        }
    }

    public void setN(int n) {
        N = n;
    }

    public int getN() {
        return N;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }
}

