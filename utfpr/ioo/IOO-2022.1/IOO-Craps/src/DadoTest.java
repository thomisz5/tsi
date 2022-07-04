import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DadoTest {
private Dado dado;

@BeforeEach
    private void antesDeCadaTeste(){
    dado = new Dado();
}
@Test
    public void deveSerPossivelLancarUmDado(){
    int numero = dado.lancar();
    assertTrue(numero>=1 && numero<=6);
}
@Test
    public void deveRetornarAFaceVoltadaParaCima(){
    int numero = dado.lancar();

    assertEquals(numero, dado.getFaceVoltadaParaCIma());
}
}