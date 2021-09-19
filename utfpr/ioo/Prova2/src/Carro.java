public class Carro {
    private int kmPorLitro;
    private double precoDoCombustivel;

    public Carro(int kmPorLitro, double precoDoCombustivel) {
        this.kmPorLitro =  kmPorLitro;
        this.precoDoCombustivel = precoDoCombustivel;
    }

    public int getKmPorLitro() {
        return kmPorLitro;
    }

    public double getPrecoDoCombustivel() {
        return precoDoCombustivel;
    }

    public double getCustoDoKm() {
        return precoDoCombustivel / kmPorLitro;
    }
}
