/*
public class Rodovia {
    private int distancia;
    private int distanciaEntrePedagios;
    private int precoDeCadaPedagio;

    public Rodovia(int distancia, int distanciaEntrePedagios, int precoDeCadaPedagio) {
        this.distancia = distancia;
        this.distanciaEntrePedagios = distanciaEntrePedagios;
        this.precoDeCadaPedagio = precoDeCadaPedagio;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public void setDistanciaEntrePedagios(int distanciaEntrePedagios) {
        this.distanciaEntrePedagios = distanciaEntrePedagios;
    }

    public void setPrecoDeCadaPedagio(int precoDeCadaPedagio) {
        this.precoDeCadaPedagio = precoDeCadaPedagio;
    }

    public int getdistancia() {
        return distancia;
    }

    public int getdistanciaEntrePedagios() {
        return distanciaEntrePedagios;
    }

    public int getprecoDeCadaPedagio() {
        return precoDeCadaPedagio;
    }

    public int getcustoDaViagemRodovia() {
        return (distancia/distanciaEntrePedagios)*precoDeCadaPedagio;
    }
}
*/

public class Rodovia {
    private int distancia;
    private int distanciaEntrePedagios;
    private int precoDecadaPedagio;

    public Rodovia(int distancia, int distanciaEntrePedagios, int precoDeCadaPedagio) {
        this.distancia = distancia;
        this.distanciaEntrePedagios = distanciaEntrePedagios;
        this.precoDecadaPedagio = precoDeCadaPedagio;
    }

    public int getdistanciaEntrePedagios() {
        return distanciaEntrePedagios;
    }

    public int getdistancia() {
        return distancia;
    }

    public int getprecoDeCadaPedagio() {
        return precoDecadaPedagio;
    }


    public int getcustoDaViagemRodovia() {
        return (distancia/distanciaEntrePedagios) * (precoDecadaPedagio);
    }
}
