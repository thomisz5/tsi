//thomas sá capucho a2256576
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MensalistaTest {
    private Mensalista mensalista;
    private Empresa empresa;
    private Funcionario funcionario;

    @BeforeEach
    public void antesDeCadaTeste() {
        empresa = new Empresa();

        mensalista = new Mensalista("julia", 100);
    }


    @Test
    public void deveRetornarOTipoDeFuncionario(){
        mensalista.getTipo();

        assertEquals("Mensalista", mensalista.getTipo());
    }

    @Test
    public void deveRetornarOSalario(){
        mensalista.calculaSalario();

        assertEquals(mensalista.getSalario(), mensalista.calculaSalario());
    }

}