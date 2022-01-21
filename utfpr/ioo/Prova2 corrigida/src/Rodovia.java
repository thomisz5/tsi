public class Rodovia {
    private double distancia;
    private double distanciaEntrePedagios;
    private double precoDeCadaPedagio;


    public Rodovia(double distancia, double distanciaEntrePedagios, double precoDeCadaPedagio) {
        this.distancia = distancia;
        this.distanciaEntrePedagios = distanciaEntrePedagios;
        this.precoDeCadaPedagio = precoDeCadaPedagio;
    }

    public double getdistancia() {
        return distancia;
    }

    public double getdistanciaEntrePedagios() {
        return distanciaEntrePedagios;
    }

    public double getprecoDeCadaPedagio() {
        return precoDeCadaPedagio;
    }
    public double getcustoDaViagemRodovia(){
        return (distancia/distanciaEntrePedagios)*precoDeCadaPedagio;
    }

}
