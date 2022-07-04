import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {
    private Pessoa pessoa;

    @Before
    public void antesDeCadaTeste(){
        pessoa = new Pessoa();
        pessoa.setNome("mili");
        pessoa.setSobrenome("milico");
    }


    @Test
    public void mustAttributeName() {
        assertEquals("mili", pessoa.getNome());
    }


    @Test
    public void mustAttributeSecondName() {
        assertEquals("milico",pessoa.getSobrenome());
    }

    @Test
    public void mustRetturnFullName() {
        assertEquals("mili milico",pessoa.getNomeCompleto());
    }
}
//passo a passo para testar no junit
//instanciar o objeto que a classe está referenciando

