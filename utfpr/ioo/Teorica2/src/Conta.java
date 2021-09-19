public abstract class Conta {
    private double saldo;

    public void depositar(double saldo) {
        this.saldo += saldo;
    }

    public double sacar(double saldo) {
        this.saldo -= saldo;
        return saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract void processar();

    public String toString() {
        return "Saldo: " + saldo;
    }
}