package exercicio_2;

public abstract class Empregrado {
    private String nome;
    private String sobrenome;
    private String cpf;
    public Empregrado(String nome, String sobrenome, String cpf){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }
    public abstract double vencimento();
}
