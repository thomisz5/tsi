public class ContaCorrente extends Conta {

    public void processar() {
        sacar(15);
    }

    public String toString() {
        return "CC -> Saldo: " + getSaldo();
    }
}