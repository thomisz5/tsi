public class Conta {
    private Cliente cliente;

    private double saldo;
    private double limite;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.limite = 500;
    }
    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getSaldoComLimite() {
        return saldo + limite;
    }

    public boolean depositar(double valor) {
        //return saldo+=valor;
        if (valor < 0)
            return false;//nao deposita

        saldo += valor;//se for maior, incrementa no saldo
        return true;
    }

    public double sacar(int valor) {
        if (valor > 0 && valor <= getSaldoComLimite())
            saldo -= valor;
        return valor;
    }

    public String getExtrato() {
        String extrato = "";
        extrato += "-----------------------------\n";
        extrato += "Cliente: " + cliente.getNome() + "\n";
        extrato += "CPF: " + cliente.getCpf() + "\n\n";
        extrato += "-----------------------------\n";
        extrato += "Descrição        | Valor (R$)\n";
        extrato += "-----------------------------\n";
        extrato += "Saldo            | " + getSaldo() + "\n";
        extrato += "Limite           | " + getLimite() + "\n";
        extrato += "Saldo com Limite | " + getSaldoComLimite() + "\n";
        return extrato;
    }
}
