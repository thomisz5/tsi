

public class Jankenpon {
    private static final String PEDRA = "Pedra";
    private static final String TESOURA = "Tesoura";
    private static final String PAPEL = "Papel";

    private Jogador jogadorA;
    private Jogador jogadorB;

    private int numeroDeRodadas;

    public Jankenpon() {
        jogadorA = new Jogador("Jogador A");
        jogadorB = new Jogador("Jogador B");
    }

    public String getResultado() {
        if (numeroDeRodadas == 0)
            return "Jogo sem rodadas registradas!";

        if (jogadorA.getPontuacao() > jogadorB.getPontuacao())
            return "O vencedor é o Jogador A";

        if (jogadorA.getPontuacao() < jogadorB.getPontuacao())
            return "O vencedor é o Jogador B";

        return "Empate";
    }

    public Jogador jogar(String sinalDoJogadorA, String sinalDoJogadorB) {
        numeroDeRodadas++;
        jogadorA.setSinal(sinalDoJogadorA);
        jogadorB.setSinal(sinalDoJogadorB);

        Jogador ganhador = getGanhadorDaRodada();

        if (ganhador != null)
            ganhador.incrementarPontuacao();

        return ganhador;
    }

    private Jogador getGanhadorDaRodada() {
        if (jogadorA.getSinal().equals(jogadorB.getSinal()))
            return null;

        if (jogadorA.getSinal().equals(PEDRA) && jogadorB.getSinal().equals(TESOURA))

            return jogadorA;

        if (jogadorA.getSinal().equals(TESOURA) && jogadorB.getSinal().equals(PAPEL))
            return jogadorA;

        if (jogadorA.getSinal().equals(PAPEL) && jogadorB.getSinal().equals(PEDRA))
            return jogadorA;

        return jogadorB;
    }
}

