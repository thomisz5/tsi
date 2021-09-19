public class Viagem{
    private Rodovia rodovia;
    private Carro carro;

    public Viagem(Rodovia rodovia, Carro carro) {
        this.rodovia = rodovia;
        this.carro = carro;
    }

    public double getCusto() {
        return rodovia.getCustoDaViagemRodovia()+ carro.getPrecoDoCombustivel()+ carro.getCustoDoKm()+ rodovia.getPrecoDeCadaPedagio();
        //errado, nao consegui resolver a tempo
    }
}