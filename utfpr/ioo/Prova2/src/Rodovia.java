public class Rodovia {
    private int Distancia, DistanciaEntrePedagios, PrecoDeCadaPedagio;

    public Rodovia(int Distancia, int DistanciaEntrePedagios, int PrecoDeCadaPedagio) {
        this.Distancia = Distancia;
        this.DistanciaEntrePedagios = DistanciaEntrePedagios;
        this.PrecoDeCadaPedagio = PrecoDeCadaPedagio;
    }

    public int getDistancia() {
        return Distancia;
    }

    public int getDistanciaEntrePedagios() {
        return DistanciaEntrePedagios;
    }

    public int getPrecoDeCadaPedagio() {
        return PrecoDeCadaPedagio;
    }

    public int getCustoDaViagemRodovia() {
        return (Distancia / DistanciaEntrePedagios) * PrecoDeCadaPedagio;
    }
}
