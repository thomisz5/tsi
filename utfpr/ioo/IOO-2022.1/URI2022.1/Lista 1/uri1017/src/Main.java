import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceTexto it = new InterfaceTexto();
        it.executar();
    }
}

class InterfaceTexto {
    private Scanner scanner;
    private Combustivel combustivel;

    public InterfaceTexto() {
        scanner = new Scanner(System.in);
        combustivel = new Combustivel();
    }

    public void executar() {
        combustivel.setTempo(scanner.nextInt());
        combustivel.setVelocidade(scanner.nextInt());

        System.out.printf("%.3f\n", combustivel.getMedia());
    }
}

class Combustivel {
    private int tempo;
    private int velocidade;

    public double km() {
        return tempo * velocidade;
    }


    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public double getMedia() {
        return km() / 12;
    }
}
