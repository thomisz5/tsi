
public class VeiculoOficial extends Veiculo {

    public VeiculoOficial(String placa) {
        super(placa, 0);
    }

    @Override
    public String getTipo() {
        return "Veiculo Oficial";
    }

    @Override
    public double getPreco() {
        return 0;
    }

}