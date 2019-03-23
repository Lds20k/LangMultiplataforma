package testafuncionarios;

public class Telefonista extends Funcionario{
    private String codEstacao;

    public Telefonista(String nome, float salario, String codEstacao) {
        super(nome, salario);
        this.codEstacao = codEstacao;
    }
    
    @Override
    public void mostrarDado(){
        super.mostrarDado();
        System.out.println( "codEstacao: " + codEstacao);
    }
}
