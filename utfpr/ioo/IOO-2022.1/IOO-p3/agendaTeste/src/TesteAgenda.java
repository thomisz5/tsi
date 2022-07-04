//thomas sá capucho
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesteAgenda {

    private Agenda agenda;
    private Contato contato;

    @BeforeEach
    public void antesDeCadaTeste() {
        agenda = new Agenda();

        contato = new Contato();
        contato.setNome("Diego");
        contato.setSobrenome("Marczal");
    }

    @Test
    public void deveRegistrarContato() {
        assertTrue(agenda.adicionaContato(contato));


        assertEquals(contato, agenda.getContatos().get(0));
    }

    @Test
    public void naoDeveRegistarContatoInvalido() {
        contato = new Contato();

        assertFalse(agenda.adicionaContato(contato));
        assertEquals(0, agenda.getQuantidadeDeContatos());
        assertFalse(contato.getErros().isEmpty());
    }

    @Test
    public void deveRemoverContatoRegistradoPeloIndice() {
        agenda.adicionaContato(contato);

        assertEquals(contato, agenda.remover(0));
        assertEquals(0, agenda.getQuantidadeDeContatos());
    }
}