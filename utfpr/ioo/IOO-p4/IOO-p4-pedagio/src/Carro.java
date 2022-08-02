
public class Carro extends Veiculo {

    public Carro(String placa, double preco) {
        super(placa, preco);
    }

    @Override
    public String getTipo() {
        return "Carro";
    }

}