
public abstract class Veiculo {

    private String placa;
    private double preco;

    public Veiculo(String placa, double preco) {
        setPlaca(placa);
        setPreco(preco);
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public abstract String getTipo();
}