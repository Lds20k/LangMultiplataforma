import model.Aluno;
import model.Escola;
import org.junit.Test;
import static org.junit.Assert.*;

public class EscolaTest {
    private Escola escola = new Escola();
    
    public EscolaTest() {
        this.escola.adicionarMatricula(new Aluno(1, 10, "Lucas"));
        this.escola.adicionarMatricula(new Aluno(2, 8, "Rodrigo"));
        this.escola.adicionarMatricula(new Aluno(3, 12, "Matheus"));
        this.escola.adicionarMatricula(new Aluno(4, 11, "Luis"));
        this.escola.adicionarMatricula(new Aluno(5, 15, "Henrique"));
        this.escola.adicionarMatricula(new Aluno(6, 16, "Piter"));
        this.escola.analisa();
    }
    
    @Test
    public void analisaMaisVelhoTeste(){
        assertEquals(8, escola.getMaisNovo());
    }
    
    @Test
    public void analisaMaisNovoTeste(){
        assertEquals(8, escola.getMaisNovo());
    }
}
