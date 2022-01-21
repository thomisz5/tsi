public class Carro {
    private double kmPorLitro;
    private double precoDoCombustivel;

    public Carro(double kmPorLitro, double precoDoCombustivel) {

        setkmPorLitro(kmPorLitro);
        setPrecoDoCombustivel(precoDoCombustivel);
    }

    public void setPrecoDoCombustivel(double precoDoCombustivel) {
        if(precoDoCombustivel>0)
        this.precoDoCombustivel = precoDoCombustivel;
    }

    public void setkmPorLitro(double kmPorLitro) {
        this.kmPorLitro = kmPorLitro;
    }

    public double getkmPorLitro() {
        return kmPorLitro;
    }

    public double getprecoDoCombustivel() {
        return precoDoCombustivel;
    }


    public double getcustoDoKm() {
        return precoDoCombustivel/kmPorLitro;
    }
}
