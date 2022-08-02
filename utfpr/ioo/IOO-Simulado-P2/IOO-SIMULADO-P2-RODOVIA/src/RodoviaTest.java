import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RodoviaTest {

    private Rodovia rodovia;

    @Test
    public void devePossuirEstadoConformeArgumentosDoConstrutor() {
        rodovia = new Rodovia(111, 37, 10);
        assertEquals(111, rodovia.getdistancia());
        assertEquals(37,  rodovia.getdistanciaEntrePedagios());
        assertEquals(10,  rodovia.getprecoDeCadaPedagio());
    }

    @Test
    public void deveCalcularOCustoDaViagemNaRodovia() {
        rodovia = new Rodovia(111, 37, 10);
        assertEquals(30, rodovia.getcustoDaViagemRodovia());
    }

}