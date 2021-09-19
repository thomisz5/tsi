import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceTexto it = new InterfaceTexto();
        it.executar();
    }
}

class InterfaceTexto {
    private Scanner scanner;
    private Raio raio;

    public InterfaceTexto() {
        scanner = new Scanner(System.in);
        raio = new Raio();
    }

    public void executar() {
        raio.setT(scanner.nextInt());
        for (int i = 0; i < raio.getT(); i++) {
            raio.setR1(scanner.nextInt());
            raio.setR2(scanner.nextInt());
            System.out.println(raio.getR3());
        }
    }
}

class Raio {
    private int T, R1, R2, R3;

    public void setT(int t) {
        this.T = t;
    }

    public void setR1(int r1) {
        this.R1 = r1;
    }

    public void setR2(int r2) {
        this.R2 = r2;
    }

    public void setR3(int r3) {
        this.R3 = r3;
    }

    public int getT() {
        return T;
    }

    public int getR1() {
        return R1;
    }

    public int getR2() {
        return R2;
    }

    public int getR3() {
        return R1 + R2;
    }
}
