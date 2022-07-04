import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContadorTest {
    private Contador c;

    @BeforeEach
    public void antesDeCadaTeste(){
        c = new Contador(24);
    }

    @Test
    public void deveTerValorInicialZero(){
        assertEquals(0,c.getValor());
    }

    @Test
    public void deveAlterarOValorDentroDoIntervalo(){
        c.setValor(10);
        assertEquals(10,c.getValor());

        c.setValor(-1);
        assertEquals(10,c.getValor());

        c.setValor(24);
        assertEquals(10,c.getValor());
    }

    @Test
    public void deveRetornarOValorComDoisDigitos(){
        assertEquals("00",c.getValorExibido());//inicial

        c.setValor(9);
        assertEquals("09",c.getValorExibido());

        c.setValor(10);
        assertEquals("10",c.getValorExibido());
    }
}