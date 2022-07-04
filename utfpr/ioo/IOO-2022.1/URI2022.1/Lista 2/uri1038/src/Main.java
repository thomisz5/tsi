import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceTexto it = new InterfaceTexto();
        it.executar();
    }
}
class InterfaceTexto {
    private Scanner scanner;
    private Lanche lanche;

    public InterfaceTexto() {
        scanner = new Scanner(System.in);
        lanche = new Lanche();
    }

    public void executar() {
        lanche.setCodigo(scanner.nextInt());
        lanche.setQuantidade(scanner.nextInt());

        System.out.printf("Total: R$ %.2f\n", lanche.getValor());
    }
}

class Lanche {
    private int codigo;
    private int quantidade;
    private float valor = 0;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValor() {
        if (codigo == 1) {
            valor = (float) (4.00 * quantidade);
        } else if (codigo == 2) {
            valor = (float) (4.50 * quantidade);
        } else if (codigo == 3) {
            valor = (float) (5.00 * quantidade);
        } else if (codigo == 4) {
            valor = (float) (2.00 * quantidade);
        } else if (codigo == 5) {
            valor = (float) (1.50 * quantidade);
        }
        return valor;
    }
}