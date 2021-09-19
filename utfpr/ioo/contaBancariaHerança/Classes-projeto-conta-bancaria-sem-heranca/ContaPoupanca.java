
public class ContaPoupanca extends Conta{
    private double juros = 0.005;

    public ContaPoupanca(Cliente cliente, int numero) {
        super(cliente,numero);
    }

    public void processar(){
        depositar(getSaldo()*juros);
    }
    public String getTipo(){
        return "CP";
    }
    /*
    public void pagarJuros() {
        depositar(getSaldo() * juros);//encapsulamento
    }
    */
}
