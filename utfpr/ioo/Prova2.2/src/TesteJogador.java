//thomas sá capucho
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TesteJogador {

    private Jogador jogador;

    @BeforeEach
    public void antesDeCadaTeste() {
        jogador = new Jogador("Jogador X");
    }

    @Test
    public void deveInstanciarUmJogadorInformandoONome() {
        assertEquals("Jogador X", jogador.getNome());
    }

    @Test
    public void deveTerPontuacaoInicialIgualAZero() {
        assertEquals(0, jogador.getPontuacao());
    }

    @Test
    public void deveIncrementarAPontuacao() {
        jogador.incrementarPontuacao();
        jogador.incrementarPontuacao();
        jogador.incrementarPontuacao();

        assertEquals(3, jogador.getPontuacao());
    }

    @Test
    public void naoDeveAlterarONomeCasoOArgumentoSejaVazioCasoUm() {
        jogador.setNome("");
        assertEquals("Jogador X", jogador.getNome());
    }

    @Test
    public void naoDeveAlterarONomeCasoOArgumentoSejaVazioCasoDois() {
        jogador.setNome("       ");
        assertEquals("Jogador X", jogador.getNome());
    }

    @Test
    public void deveAlterarONomeCasoOArgumentoNaoSejaVazio() {
        jogador.setNome("Jonas");
        assertEquals("Jonas", jogador.getNome());
    }

    @Test
    public void deveAlterarOSinalEscolhido() {
        jogador.setSinal("Papel");
        assertEquals("Papel", jogador.getSinal());

        jogador.setSinal("Pedra");
        assertEquals("Pedra", jogador.getSinal());
    }
}