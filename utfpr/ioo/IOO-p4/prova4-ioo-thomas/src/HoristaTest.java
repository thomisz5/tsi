//thomas sá capucho 2256576
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HoristaTest {
    private Horista horista;
    private Empresa empresa;
    private Funcionario funcionario;

    @BeforeEach
    public void antesDeCadaTeste(){
        empresa = new Empresa();

        horista = new Horista("julia",10,30);
    }

    @Test
    public void deveRetornarOTipoDeFuncionario(){
        horista.getTipo();

        assertEquals("Horista", horista.getTipo());
    }

    @Test
    public void deveCalcularOSalario(){
        horista.calculaSalario();

        assertEquals(300 , horista.calculaSalario());
    }
}