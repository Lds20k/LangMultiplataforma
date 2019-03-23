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
public class Professor extends Pessoa{
    private float salario;

    public Professor(float salario, String nome, String cpf) {
        super(nome, cpf);
        this.salario = salario;
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println( "Salario: " + this.salario );
    }
    
    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
