/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo;

/**
 *
 * @author Lucas
 */
public class Aluno extends Pessoa {
    
    private int ra;
    
    public Aluno(String nome, String cpf, int ra) {
        super(nome, cpf);
        this.ra = ra;
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println( "RA: " + this.ra );
    }
    
    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }
    
    
}
