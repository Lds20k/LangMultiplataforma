package testafuncionarios;

public class Funcionario {
    private String nome;
    private float salario;

    public Funcionario(String nome, float salario){
        this.nome = nome;
        this.salario = salario;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public float calcularBonificacao(){
        return this.salario+(this.salario * 0.1f);
    }
    
    public void mostrarDado(){
        System.out.println( "Nome: " + nome);
        System.out.println( "Salario: " + salario);
    }
}
