import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTeste {

    private static final double DELTA = 0.001;

    private Carro carro;

    @BeforeEach
    public void antesDeCadaConstrutor() {
        carro = new Carro(10, 4.20);
    }

    @org.junit.jupiter.api.Test
    public void devePossuirEstadoConformeArgumentosDoConstrutor() {
        assertEquals(10, carro.getkmPorLitro());
        assertEquals(4.20, carro.getprecoDoCombustivel());
    }

    @Test
    public void deveCalcularOCustoDoKmRodado() {
        assertEquals(0.42, carro.getcustoDoKm(), DELTA);
    }
}