//thomas sá capucho a2256576
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {
    private Mensalista mensalista;
    private Horista horista;
    private Empresa empresa;
    private Funcionario funcionario;

    @BeforeEach
    public void antesDeCadaTeste() {
        empresa = new Empresa();

        horista = new Horista("maria",10,30);
        mensalista = new Mensalista("julia", 100);
    }


    @Test
    public void deveRetornarFuncionario() {
        empresa.registraFuncionario(funcionario);

        assertEquals(funcionario, empresa.getFuncionarios().get(0));
    }

    /*@Test
    public void deveAdicionarFuncionario(){
        empresa.registraFuncionario(mensalista);

        assertEquals(mensalista, empresa.registraFuncionario(mensalista));
    }*/
}