
import operacoes.Calculadora;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author aluno
 */
public class OperacoesTest {
    
    int a, b;
    
    public OperacoesTest() {
    }
    
    @Before
    public void setUp(){
        a = 3; b = 5;
    }
    
    @Test
    public void testeSoma(){
        a = 2; b = a;
        assertEquals(3, new Calculadora().soma(a, b));
    }
    
    @Test
    public void testeSubtra(){
        assertEquals(-1, new Calculadora().subtra(1, 2));
    }
    
    @Test
    public void testeMult(){
        assertEquals(15, new Calculadora().mult(a, b));
    }
    
    @Test
    public void testeDiv(){
        assertEquals(2, new Calculadora().div(2, 1), 2);
    }
    
    @Test
    public void testeIsNegative(){
        assertTrue(new Calculadora().isNegative(-2));
    }
    
    @After
    public void setDown(){
        a = 0; b = 0;
    }
}
