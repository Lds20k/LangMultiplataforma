package control;

import java.util.ArrayList;
import java.util.Iterator;
import model.Aluno;

public class ControleAluno {
    private ArrayList<Aluno> alunos;
    public ControleAluno(){
        this.alunos = new ArrayList();
    }
    public void adicionarNaLista(String Nome, String RA, String Linguagem){
        alunos.add(new Aluno(Nome, RA, Linguagem));
    }
    
    public String pegarUltimoAdicionado(){
        Iterator<Aluno> it = alunos.iterator();
        Aluno alo;
        String ret = "";
        while(it.hasNext()){
            alo = it.next();
            ret = alo.getRA() + " - " + alo.getNome() + " - " + alo.getLinguagem();
        }
        return ret;
    }
}
