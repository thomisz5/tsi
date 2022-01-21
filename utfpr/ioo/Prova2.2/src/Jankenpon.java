//thomas sá capucho
public class Jankenpon {
    private Jogador jogador;

    public Jankenpon(){
        Jankenpon jogo = new Jankenpon();
    }


    public String jogar(String sinal, String nome) {
        return jogador.getSinal()+jogador.getNome();
    }

    public String getResultado() {
        return ("O vencedor é o Jogador A\"");//errado, eu sei
    }
}
