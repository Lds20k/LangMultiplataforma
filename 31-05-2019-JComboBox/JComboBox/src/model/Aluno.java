package model;

public class Aluno {
    private String RA;
    private String Nome;
    private String Linguagem;

    public Aluno(String Nome, String RA, String Linguagem) {
        this.RA = RA;
        this.Nome = Nome;
        this.Linguagem = Linguagem;
    }
    
    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getLinguagem() {
        return Linguagem;
    }

    public void setLinguagem(String Linguagem) {
        this.Linguagem = Linguagem;
    }
}
