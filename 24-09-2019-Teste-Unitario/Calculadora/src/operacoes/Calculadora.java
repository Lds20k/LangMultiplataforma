/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacoes;

/**
 *
 * @author aluno
 */
public class Calculadora {
    public int soma(int a, int b){
        return a+b;
    }
    
    public int subtra(int a, int b){
        return a-b;
    }
    
    public int mult(int a, int b){
        return a*b;
    }
    
    public float div(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("Divisão por zero");
        }
        return a/b;
    }
    
    public boolean isNegative(int a){
        if(a < 0){
            return true;
        }
        return false;
    }
    
    
}
