import java.util.ArrayList;
public class Banco {
    private ArrayList<Conta> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void registra(Conta conta) {
        contas.add(conta);
    }

    public void processarContas() {
        for(Conta conta : contas) {
            conta.processar();
        }
    }

    public void exibe() {
        for(Conta conta : contas) {
            System.out.println(conta);
        }
    }
}