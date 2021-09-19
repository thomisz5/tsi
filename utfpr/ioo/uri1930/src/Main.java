import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceTexto it = new InterfaceTexto();
        it.executar();
    }
}

class InterfaceTexto {
    private Scanner scanner;
    private Tomada tomada;

    public InterfaceTexto() {
        scanner = new Scanner(System.in);
        tomada = new Tomada();
    }

    public void executar() {
        tomada.setT1(scanner.nextInt());
        tomada.setT2(scanner.nextInt());
        tomada.setT3(scanner.nextInt());
        tomada.setT4(scanner.nextInt());

        System.out.println(tomada.getTotalTomada());
    }
}

class Tomada {
    private int T1, T2, T3, T4, totalTomada;

    public void setT1(int t1) {
        T1 = t1;
    }

    public void setT2(int t2) {
        T2 = t2;
    }

    public void setT3(int t3) {
        T3 = t3;
    }

    public void setT4(int t4) {
        T4 = t4;
    }

    public int getTotalTomada() {
        return totalTomada = (T1 + T2 + T3 + T4) - 3;
    }
}
