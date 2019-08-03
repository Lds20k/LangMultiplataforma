package aula1.model;

public class Aluno {
    private int RA;
    private String nome;

    public Aluno(int RA, String nome) {
        this.RA   = RA;
        this.nome = nome;
    }
    
    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
