//thomas sá capucho
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TesteJankenpon {

    private static final String PEDRA = "Pedra";
    private static final String TESOURA = "Tesoura";
    private static final String PAPEL = "Papel";

    private Jankenpon jogo;

    @BeforeEach
    public void antesDeCadaTeste() {
        jogo = new Jankenpon();
    }

    @Test
    public void deveTerOResultadoIncial() {
        assertEquals("Jogo sem rodadas registradas!", jogo.getResultado());
    }

    @Test
    public void deveDeterminarOGanhadorDaRodadaCasoUm() {
        assertEquals("Jogador A", jogo.jogar(PEDRA, TESOURA).getNome());
        assertEquals("Jogador B", jogo.jogar(TESOURA, PEDRA).getNome());
    }

    @Test
    public void deveDeterminarOGanhadorDaRodadaCasoDois() {
        assertEquals("Jogador A", jogo.jogar(TESOURA, PAPEL).getNome());
        assertEquals("Jogador B", jogo.jogar(PAPEL, TESOURA).getNome());
    }

    @Test
    public void deveDeterminarOGanhadorDaRodadaCasoTres() {
        assertEquals("Jogador A", jogo.jogar(PAPEL, PEDRA).getNome());
        assertEquals("Jogador B", jogo.jogar(PEDRA, PAPEL).getNome());
    }

    @Test
    public void deveDeterminarOGanhadorDaRodadaCasoQuatro() {
        assertEquals(null, jogo.jogar(PEDRA, PEDRA));
        // o retorno null do método jogar indica deu empate!
    }

    @Test
    public void deveDeterminarOResultadoDoJogoComUmaRodada() {
        jogo.jogar(PEDRA, TESOURA);
        assertEquals("O vencedor é o Jogador A", jogo.getResultado());
    }

    @Test
    public void deveDeterminarOResultadoDoJogoComDuasRodada() {
        jogo.jogar(PEDRA, TESOURA);
        jogo.jogar(PEDRA, PAPEL);

        assertEquals("Empate", jogo.getResultado());
    }

    @Test
    public void deveDeterminarOResultadoDoJogoComTresRodada() {
        jogo.jogar(PEDRA, TESOURA);
        jogo.jogar(PEDRA, PAPEL);
        jogo.jogar(PAPEL, TESOURA);

        assertEquals("O vencedor é o Jogador B", jogo.getResultado());
    }
}