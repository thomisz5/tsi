public class ContaPoupanca extends Conta {

    public void processar() {
        depositar(getSaldo()*0.01);
    }

    public String toString() {
        return "CP -> Saldo: " + getSaldo();
    }
}