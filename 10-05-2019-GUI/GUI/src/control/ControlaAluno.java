/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import java.util.ArrayList;
import java.util.Iterator;
import model.Aluno;

/**
 *
 * @author aluno
 */
public class ControlaAluno {
    private ArrayList lista;
    
    public ControlaAluno(){
        lista = new ArrayList();
    }
    
    public Aluno adicionaNaLista(String nome, int idade){
        Aluno al1 = new Aluno();
        al1.setNome(nome);
        al1.setIdade(idade);
        
        lista.add(al1);
        return al1;
    }
    
    public boolean comparar(String nome, int idade){
        Iterator<Aluno> at = lista.iterator();
        while(at.hasNext()){
            Aluno al = at.next();
            if( al.getIdade() == idade && al.getNome().equals(nome) ){
                return true;
            }
        }
        return false;
    }
    
    public int somarIdades(){
        Iterator<Aluno> at = lista.iterator();
        int soma = 0;
        while(at.hasNext()){
            soma += at.next().getIdade();
        }
        return soma;
    }
}
