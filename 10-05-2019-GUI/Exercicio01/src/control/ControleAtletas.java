
package control;

import java.util.ArrayList;
import java.util.Iterator;
import model.Atleta;

public class ControleAtletas {
    private ArrayList<Atleta> lista;
    
    public ControleAtletas(){
        lista = new ArrayList();
    }
    
    public Atleta adicionarNaLista(String nome, float peso, float altura, int idade){
        Atleta atl1 = new Atleta(nome, peso, altura, idade);
        lista.add(atl1);
        return atl1;
    }
    
    public float PesoMedio(){
        float media = 0;
        int count = 0;
        Iterator<Atleta> at = lista.iterator();
        while(at.hasNext()){
            media += at.next().getPeso();
            count++;
        }
        media /= count;
        return media;
    }
    
    public int MaioresDeIdade(){
        int maiorers = 0;
        Iterator<Atleta> at = lista.iterator();
        while(at.hasNext()){
            if( at.next().getIdade() >= 18){
                maiorers++;
            }
        }
        return maiorers;
    }
    
    public float MaisAlto(){
        float maior = 0;
        Iterator<Atleta> at = lista.iterator();
        while(at.hasNext()){
            Atleta atl1 = at.next();
            if( atl1.getAltura() >= maior){
                maior = atl1.getAltura();
            }
        }
        return maior;
    }
    
    public boolean Vazia(){
        return lista.isEmpty();
    }
}
