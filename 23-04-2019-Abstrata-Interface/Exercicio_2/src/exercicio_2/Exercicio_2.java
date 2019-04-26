package exercicio_2;

import java.util.ArrayList;
import java.util.Iterator;

public class Exercicio_2 {

    public static void main(String[] args) {
        ArrayList<Empregrado> empregados = new ArrayList();
        
        Assalariado ass1 = new Assalariado("Lucas", "da Silva dos Santos", "123123", 1000);
        Assalariado ass2 = new Assalariado("José", "da Silva", "48884", 1000);
        
        Comissionado com1 = new Comissionado("Rey", "da Silva dos Santos", "48645", 1000, 1);
        Comissionado com2 = new Comissionado("Raimunda", "da Silva", "48654", 1000, 1);
        
        Horista hor1 = new Horista("Rey", "da Silva dos Santos", "48645", 1, 1000);
        Horista hor2 = new Horista("Raimunda", "da Silva", "48654", 1, 1000);
        
        empregados.add(ass1);
        empregados.add(ass2);
        
        empregados.add(com1);
        empregados.add(com2);
        
        empregados.add(hor1);
        empregados.add(hor2);
        
        Iterator<Empregrado> at = empregados.iterator();
        
        int total_de_venda = 0;
        while(at.hasNext()){
            Empregrado buff = at.next();
            if(buff instanceof Comissionado){
                total_de_venda += ((Comissionado) buff).getTotalVenda();
            }
        }
        
        System.out.println("Total de vendar: " + total_de_venda);
    }
    
}
