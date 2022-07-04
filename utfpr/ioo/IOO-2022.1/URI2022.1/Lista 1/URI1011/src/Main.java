import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceTexto it = new InterfaceTexto();
        it.executar();
    }
}

class InterfaceTexto {
    private Scanner scanner;
    private Volume volume;

    public InterfaceTexto() {
        scanner = new Scanner(System.in);
        volume = new Volume();
    }

    public void executar() {
        volume.setRaio(scanner.nextDouble());

        System.out.printf("VOLUME = %.3f\n", volume.getVolume());
    }
}

class Volume {
    private double raio;

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getVolume() {
        double pi = 3.14159;
        return (4 / 3.0) * (pi * raio * raio * raio);
    }
}
