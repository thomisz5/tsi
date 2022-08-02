//thomas sá capucho
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesteContato {

    private Contato contato;

    @BeforeEach
    public void antesDeCadaTeste() {
        contato = new Contato();
    }

    @Test
    public void deveTerNomeVazio() {
        assertEquals("", contato.getNome());
    }

    @Test
    public void deveTerSobrenomeVazio() {
        assertEquals("", contato.getSobrenome());
    }

    @Test
    public void deveSerInvalidoQuandoONomeForVazio() {
        assertFalse(contato.eValido());

        String erro = "Nome não pode ser vazio.";
        assertEquals(erro, contato.getErros().get(0));
    }

    @Test
    public void deveSerInvalidoQuandoOSobrenomeForVazio() {
        contato.setNome("Diego");
        assertFalse(contato.eValido());

        String erro = "Sobrenome não pode ser vazio.";
        assertEquals(erro, contato.getErros().get(0));
    }


    @Test
    public void deveSeTornarValido() {
        assertFalse(contato.eValido());

        contato.setNome("Diego");
        contato.setSobrenome("Marczal");

        assertTrue(contato.eValido());
        assertEquals(0, contato.getErros().size());
    }

    @Test
    public void deveAlterarONome() {
        contato.setNome("Diego");
        assertEquals("Diego", contato.getNome());
    }

    @Test
    public void deveAlterarOSobrenome() {
        contato.setSobrenome("Marczal");
        assertEquals("Marczal", contato.getSobrenome());
    }

    @Test
    public void deveRetornarONomeCompleto() {
        contato.setNome("Diego");
        contato.setSobrenome("Marczal");
        assertEquals("Diego Marczal", contato.getNomeCompleto());
    }

    @Test
    public void deveIgnorarEspacosAntesEDepoisDoNomeESobrenome() {
        contato.setNome("  Diego  ");
        assertEquals("Diego", contato.getNome());

        contato.setSobrenome("   Marczal  ");
        assertEquals("Marczal", contato.getSobrenome());

        assertEquals("Diego Marczal", contato.getNomeCompleto());
    }
}