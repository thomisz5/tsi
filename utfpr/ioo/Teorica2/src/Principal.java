public class Principal {
    private Principal() {}

    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        cc.depositar(100);
        cp.depositar(100);

        Banco banco = new Banco();
        banco.registra(cc);
        banco.registra(cp);

        banco.processarContas();

        banco.exibe();
    }
}