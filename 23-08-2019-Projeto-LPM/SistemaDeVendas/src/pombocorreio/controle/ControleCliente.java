/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pombocorreio.controle;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import pombocorreio.modelo.Cliente;
import pombocorreio.modelo.dao.ClienteDAO;

/**
 *
 * @author aluno
 */
public class ControleCliente {
    
    public boolean inserir(String CPF, String telefoneResidencial, 
                            String telefoneCelular, String nome, String email,
                            String numero, String rua, String bairro, 
                            String cidade, String estado
    ){
        boolean retorno = false;
        ClienteDAO clienteDAO = new ClienteDAO();
        Cliente cliente = new Cliente();
        cliente.setCPF(CPF);
        cliente.setTelefone_Resi(telefoneResidencial);
        cliente.setTelefone_Celu(telefoneCelular);
        cliente.setNome(nome);
        cliente.setEmail(email);
        cliente.setNumero(numero);
        cliente.setRua(rua);
        cliente.setBairro(bairro);
        cliente.setCidade(cidade);
        cliente.setEstado(estado);
        try {
            retorno = clienteDAO.inserir(cliente);
        } catch (SQLException ex) {
            Logger.getLogger(ControleCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }
    
    public ArrayList<Cliente> consultar(){
        ClienteDAO clienteDAO = new ClienteDAO();
        try {
            return clienteDAO.consultar();
        } catch (SQLException ex) {
            Logger.getLogger(ControleCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public boolean excluir(int Cliente_ID){
        boolean retorno = false;
        try{
           ClienteDAO clienteDAO = new ClienteDAO();
           Cliente cliente = new Cliente();
           cliente.setID(Cliente_ID);
           clienteDAO.excluir(cliente);
           retorno = true;
        }catch(SQLException ex){
            Logger.getLogger(ControleCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }
}
