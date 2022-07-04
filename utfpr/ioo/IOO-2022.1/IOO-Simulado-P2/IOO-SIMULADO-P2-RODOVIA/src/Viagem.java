/*
public class Viagem {
    private Rodovia rodovia;
    private Carro carro;
    
    public Viagem(Rodovia rodovia, Carro carro) {
        this.rodovia=rodovia;
        this.carro=carro;
    }
    public double getCusto() {
        return (carro.getcustoDoKm() * rodovia.getdistancia()) + rodovia.getcustoDaViagemRodovia();
    }
}
*/
public class Viagem {
    private Rodovia rodovia;
    private Carro carro;

    public Viagem(Rodovia rodovia, Carro carro){
        this.rodovia =rodovia;
        this.carro= carro;
    }

    public double getCusto(){
        return (carro.getcustoDoKm()*rodovia.getdistancia()+rodovia.getcustoDaViagemRodovia());
    }
}
