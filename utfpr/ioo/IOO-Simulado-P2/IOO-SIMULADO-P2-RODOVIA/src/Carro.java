/*
public class Carro {
    private int kmPorLitro;
    private double precoDoCombustivel;

    public Carro(int kmPorLitro, double precoDoCombustivel) {
        setKmPorLitro(kmPorLitro);
        setPrecoDoCombustivel(precoDoCombustivel);
    }

    public void setKmPorLitro(int kmPorLitro) {
        this.kmPorLitro = kmPorLitro;
    }

    public void setPrecoDoCombustivel(double precoDoCombustivel) {
        this.precoDoCombustivel = precoDoCombustivel;
    }

    public int getkmPorLitro() {
        return kmPorLitro;
    }

    public double getprecoDoCombustivel() {
        return precoDoCombustivel;
    }

    public double getcustoDoKm() {
        return precoDoCombustivel / kmPorLitro;
    }
}
*/
public class Carro {
    private int kmPorLitro;
    private double precoDoCombustivel;

    public Carro(int kmPorLitro, double precoDoCombustivel) {
        this.kmPorLitro = kmPorLitro;
        this.precoDoCombustivel = precoDoCombustivel;
    }

    public double getprecoDoCombustivel() {
        return precoDoCombustivel;
    }

    public int getkmPorLitro() {
        return kmPorLitro;
    }


    public double getcustoDoKm() {
        return precoDoCombustivel / kmPorLitro;
    }
}
