package model;

public class Aluno {
    private int RA;
    private int idade;
    private String nome;

    public Aluno(int RA, int idade, String nome) {
        this.RA = RA;
        this.idade = idade;
        this.nome = nome;
    }
    
    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
