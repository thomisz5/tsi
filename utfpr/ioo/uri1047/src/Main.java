import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceTexto it = new InterfaceTexto();
        it.executar();
    }
}

class InterfaceTexto {
    private Scanner scanner;
    private Jogo jogo;

    public InterfaceTexto() {
        scanner = new Scanner(System.in);
        jogo = new Jogo();
    }

    public void executar() {
        jogo.setHora_start(scanner.nextInt());
        jogo.setMinu_start(scanner.nextInt());
        jogo.setHora_end(scanner.nextInt());
        jogo.setMinu_end(scanner.nextInt());

        

    }


}

class Jogo {
    private int hora_start;
    private int minu_start;
    private int all_minu_start = hora_start * 60 + minu_start;
    private int hora_end;
    private int minu_end;
    private int all_minu_end = hora_end * 60 + minu_end;
    private int all_minu_diff = (24 * 60 - all_minu_start) + all_minu_end;
    private int horas = all_minu_diff / 60;
    private int minutos = all_minu_diff % 60;

    public void setHora_start(int hora_start) {
        this.hora_start = hora_start;
    }

    public void setMinu_start(int minu_start) {
        this.minu_start = minu_start;
    }

    public void setHora_end(int hora_end) {
        this.hora_end = hora_end;
    }

    public void setMinu_end(int minu_end) {
        this.minu_end = minu_end;
    }


    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }
    public int getCondicao(){
        if (horas >= 24 && minutos >= 1) {
            horas = horas % 24;
        };
        return 0;
    }
}

