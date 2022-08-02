public class Caminhao extends Veiculo {

    private int numeroDeEixos;

    public Caminhao(String placa, double preco, int numeroDeEixos) {
        super(placa, preco);
        setNumeroDeEixos(numeroDeEixos);
    }

    public void setNumeroDeEixos(int numeroDeEixos) {
        this.numeroDeEixos = numeroDeEixos;
    }

    public int getNumeroDeEixos() {
        return numeroDeEixos;
    }

    @Override
    public String getTipo() {
        return "Caminhao";
    }

    @Override
    public double getPreco() {
        return super.getPreco() * (1 + (0.1 * numeroDeEixos));
    }
}