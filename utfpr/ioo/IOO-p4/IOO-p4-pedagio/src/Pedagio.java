import java.util.ArrayList;

public class Pedagio {

    private ArrayList<Veiculo> veiculos;

    public Pedagio() {
        veiculos = new ArrayList<>();
    }

    public void registraVeiculos(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public double getTotalArrecadado() {
        double total = 0;
        for (Veiculo veiculo : veiculos) {
            total += veiculo.getPreco();
        }
        return total;
    }

    public int getTotalDeVeiculos() {
        return veiculos.size();
    }
}