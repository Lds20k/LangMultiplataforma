package model;

import java.util.ArrayList;
import java.util.Iterator;

public class Escola {
    private ArrayList<Aluno> matricula;
    private int maisVelho;
    private int maisNovo;

    public Escola() {
        this.maisVelho = 0;
        this.maisNovo  = 0;
        this.matricula = new ArrayList<>();
    }
    
    //CORRETO
    public void analisa(){
        Iterator<Aluno> it = matricula.iterator();
        boolean primeiro = true;
        while(it.hasNext()){
            Aluno aluno = it.next();
            if(aluno.getIdade() > this.maisVelho){
                this.maisVelho = aluno.getIdade();
            }
            if(aluno.getIdade() < this.maisNovo || primeiro){
                this.maisNovo = aluno.getIdade();
                primeiro = false;
            }
        }
    }
    
    //ERRADO
    /*
    public void analisa(){
        int maior = 0; int menor = 0;
        ArrayList lista = this.matricula;
        Iterator it = lista.iterator();
        while (it.hasNext()){
            Aluno al = (Aluno) it.next();
            if (al.getIdade()>maior)
            maior = al.getIdade();
            else
            if (al.getIdade()<menor)
            menor = al.getIdade(); 
        }
        maisVelho = maior;
        maisNovo = menor;
    }
    */
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
    
    public void adicionarMatricula(Aluno aluno){
        this.matricula.add(aluno);
    }
    
}
