package aula1.model;

public class Aluno {
    private int RA;
    private String nome;
    private String linguagem;
    private int status;

    public Aluno(int RA, String nome, String linguagem, int status) {
        this.RA        = RA;
        this.nome      = nome;
        this.linguagem = linguagem;
        this.status    = status;
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
    
    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
