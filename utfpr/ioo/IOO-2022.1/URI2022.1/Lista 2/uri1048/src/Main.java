
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceTexto it = new InterfaceTexto();
        it.executar();
    }
}

class InterfaceTexto {
    private Scanner scanner;
    private Aumento aumento;

    public InterfaceTexto() {
        scanner = new Scanner(System.in);
        aumento = new Aumento();
    }

    public void executar() {
        aumento.setN(scanner.nextFloat());

        System.out.printf("Novo salario: %.2f\n", +aumento.aumentoSalarial());
        System.out.printf("Reajuste ganho: %.2f\n", + aumento.getReajuste());
        System.out.println("Em percentual: " + aumento.getPorcentagem() + " %");
    }
}

class Aumento {
    private float N;
    private float novoSalario = 0;
    private float reajuste = 0;
    private int porcentagem = 0;

    public void setN(float n) {
        N = n;
    }

    public int getPorcentagem() {
        return porcentagem;
    }

    public float getReajuste() {
        return reajuste;
    }

    public float aumentoSalarial() {
        if (N >= 0 && N <= 400.00) {
            porcentagem = 15;
            novoSalario = (float) (N + (N * (porcentagem / 100.00)));
            reajuste = (float) (N * (porcentagem / 100.00));
        } else if (N >= 400.01 && N <= 800.00) {
            porcentagem = 12;
            novoSalario = (float) (N + (N * (porcentagem / 100.00)));
            reajuste = (float) (N * (porcentagem / 100.00));
        } else if (N >= 800.01 && N <= 1200.00) {
            porcentagem = 10;
            novoSalario = (float) (N + (N * (porcentagem / 100.00)));
            reajuste = (float) (N * (porcentagem / 100.00));
        } else if (N >= 1200.01 && N <= 2000.00) {
            porcentagem = 7;
            novoSalario = (float) (N + (N * (porcentagem / 100.00)));
            reajuste = (float) (N * (porcentagem / 100.00));
        } else if (N >= 2000.01) {
            porcentagem = 4;
            novoSalario = (float) (N + (N * (porcentagem / 100.00)));
            reajuste = (float) (N * (porcentagem / 100.00));
        }
        return novoSalario;
    }
}