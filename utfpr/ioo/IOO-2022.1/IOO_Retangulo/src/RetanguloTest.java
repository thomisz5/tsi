import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetanguloTest {
    private Retangulo r;

    @BeforeEach
    public void antesDeCadaTeste() {
        r = new Retangulo(5,10);
    }

    @Test
    public void deveSerPossivelInstanciarPeloConstrutorPadrao() {
       // Retangulo r = new Retangulo();

        assertEquals(1, r.getBase());
        assertEquals(1, r.getAltura());
    }

    @org.junit.jupiter.api.Test
    public void deveSerPossivelInstanciarPeloConstrutorInformandoUmArgumento() {
      //  Retangulo r = new Retangulo(10);

        assertEquals(10, r.getBase());
        assertEquals(10, r.getAltura());
    }

    @org.junit.jupiter.api.Test
    public void deveSerPossivelInstanciarPeloConstrutorComDoisParametros() {
       // Retangulo r = new Retangulo(10, 20);

        assertEquals(10, r.getBase());
        assertEquals(20, r.getAltura());
    }

    @Test
    public void deveAlterarABasePeloSet() {
        r.setBase(15);
        assertEquals(15, r.getBase());
    }

    @Test
    public void deveAlterarAAlturaPeloSet() {
        r.setAltura(20);
        assertEquals(20, r.getAltura());
    }

    @Test
    public void deveSerPossivelSaberAArea() {
        assertEquals(50, r.getArea());
    }

    @Test
    public void deveSerPossivelSaberOPerimetro() {
        assertEquals(30, r.getPerimetro());
    }

    @Test
    public void deveInformarSeEQuadrado() {
      //  Retangulo r = new Retangulo();

        assertTrue(r.eQuadrado());//verificar se r.equadrado tem retorno true(quadrado)

        r.setBase(5);
        assertFalse(r.eQuadrado());
    }

    @Test
    public void deveInformarseTemAreaMaiorQueUmValorInformado() {
        Retangulo r = new Retangulo(5, 10);
        assertTrue(r.temAreaMaiorQue(30));

        assertFalse(r.temAreaMaiorQue(60));
    }

    @Test
    public void deveInformarSeTemAreaMaiorQueOutroRetangulo() {
        Retangulo r = new Retangulo(5, 10);
        Retangulo r1 = new Retangulo(6, 11);

        assertTrue(r1.temAreaMaiorQue(r));
        assertFalse(r.temAreaMaiorQue(r1));
    }

}