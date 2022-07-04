import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelogioTest {
    private Relogio relogio;

    @BeforeEach
    public void antesDeCadaTeste(){
        relogio = new Relogio();
    }

    @Test
    public void deveTerHoraInicialZero(){
        assertEquals("00:00", relogio.getHora());
    }
    @Test
    public void deveSerPossivelAjustarAHoraNoConstrutor(){
        relogio = new Relogio(15,30);
        assertEquals("15:30",relogio.getHora());
    }

    @Test
    public void deveMarcarRitmo(){
        relogio.marcaRitmo();
        assertEquals("00:01",relogio.getHora());
    }

    @Test
    public void deveMarcarORitmoIncrementandoHoras(){
        relogio.ajustaHora(15,59);
        relogio.marcaRitmo();//incrementando

        assertEquals("16:00",relogio.getHora());
    }

    @Test
    public void deveAjustarAHora(){
        relogio.ajustaHora(15,59);
        assertEquals("15,59",relogio.getHora());
    }

    @Test
    public void naoDeveAjustarAHora(){
        relogio.ajustaHora(24,60);
        assertEquals("00:00",relogio.getHora());
    }
}