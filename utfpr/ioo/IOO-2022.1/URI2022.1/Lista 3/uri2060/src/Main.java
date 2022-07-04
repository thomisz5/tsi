import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceTexto i = new InterfaceTexto();
        i.executar();
    }
}

class InterfaceTexto {
    private Scanner scanner;
    private Multiplos multiplos;


    public InterfaceTexto() {
        scanner = new Scanner(System.in);
        multiplos = new Multiplos();

    }

    public void executar() {
        multiplos.setN(scanner.nextInt());
        for (int i = 0; i < multiplos.getN(); i++) {
            multiplos.setL(scanner.nextInt());
            multiplos.getMultiplos();
        }
        System.out.println(multiplos.getM2() + "Multiplo(s) de 2");
        System.out.println(multiplos.getM3() + "Multiplo(s) de 3");
        System.out.println(multiplos.getM4() + "Multiplo(s) de 4");
        System.out.println(multiplos.getM5() + "Multiplo(s) de 5");
    }
}

class Multiplos {
    private int L;
    private int N;
    private int m2 = 0;
    private int m3 = 0;
    private int m4 = 0;
    private int m5 = 0;

    public void setN(int n) {
        N = n;
    }

    public int getN() {
        return N;
    }

    public void setL(int l) {
        L = l;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    public void setM3(int m3) {
        this.m3 = m3;
    }

    public void setM4(int m4) {
        this.m4 = m4;
    }

    public void setM5(int m5) {
        this.m5 = m5;
    }

    public int getL() {
        return L;
    }

    public int getM2() {
        return m2;
    }

    public int getM3() {
        return m3;
    }

    public int getM4() {
        return m4;
    }

    public int getM5() {
        return m5;
    }

    public void getMultiplos() {
        if (L % 2 == 0) m2++;
        if (L % 3 == 0) m3++;
        if (L % 4 == 0) m4++;
        if (L % 5 == 0) m5++;
    }
}