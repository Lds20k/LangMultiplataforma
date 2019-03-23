package testafuncionarios;

public class Secretaria extends Funcionario{
    private String nRamal;

    public Secretaria(String nome, float salario, String nRamal) {
        super(nome, salario);
        this.nRamal = nRamal;
    }
    
    @Override
    public void mostrarDado(){
        super.mostrarDado();
        System.out.println( "codEstacao: " + nRamal);
    }
}
