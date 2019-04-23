package aula.abstrata;

public abstract class Pessoa {
    private int idade;
    public abstract void mostraDados();
    public void testaDados(){
        System.out.println("Testando dados da pessoas");
    } 
}
