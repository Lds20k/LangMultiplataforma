/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pombocorreio.controle;

import java.util.ArrayList;
import pombocorreio.modelo.Cliente;
import pombocorreio.modelo.Produto;

/**
 *
 * @author aluno
 */
public class ControleVenda {
    private ControleProduto ctrProduto = null;
    private ControleCliente ctrCliente = null;

    public ControleVenda() {
        ctrProduto = new ControleProduto();
        ctrCliente = new ControleCliente();
    }
    
    public ArrayList<Produto> consultarProdutos(){
        return ctrProduto.consultar();
    }
    
    public ArrayList<Cliente> consultarClientes(){
        return ctrCliente.consultar();
    }
}
