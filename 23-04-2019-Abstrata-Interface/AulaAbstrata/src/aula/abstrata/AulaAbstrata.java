package aula.abstrata;

public class AulaAbstrata {
    
    public static void main(String[] args) {
        Aluno al1 = new Aluno();
        al1.mostraDados();
        al1.testaDados();
        
        Professor pf1 = new Professor();
        pf1.mostraDados();
        pf1.testaDados();
    }
    
}
