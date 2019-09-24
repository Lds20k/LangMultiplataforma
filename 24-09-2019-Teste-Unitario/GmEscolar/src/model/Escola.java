package model;

import java.util.ArrayList;

public class Escola {
    private ArrayList<Aluno> matricula;
    private int maisVelho;
    private int maisNovo;

    public Escola(ArrayList<Aluno> matricula, int maisVelho, int maisNovo) {
        this.maisVelho = maisVelho;
        this.maisNovo = maisNovo;
    }
    
    public ArrayList<Aluno> getMatricula() {
        return matricula;
    }

    public void setMatricula(ArrayList<Aluno> matricula) {
        this.matricula = matricula;
    }

    public int getMaisVelho() {
        return maisVelho;
    }

    public void setMaisVelho(int maisVelho) {
        this.maisVelho = maisVelho;
    }

    public int getMaisNovo() {
        return maisNovo;
    }

    public void setMaisNovo(int maisNovo) {
        this.maisNovo = maisNovo;
    }
    
}
