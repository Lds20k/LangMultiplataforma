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
import pombocorreio.modelo.Produto;
import pombocorreio.modelo.dao.ProdutoDAO;

/**
 *
 * @author aluno
 */
public class ControleProduto {
    public boolean inserir(String Descricao, String unidade, String unidadeTipo, float preco){
        boolean retorno = false;
        try {
            ProdutoDAO produtoDAO = new ProdutoDAO();
            Produto produto = new Produto();
            produto.setDescricao(Descricao);
            produto.setUnidade(unidade);
            produto.setUnidadeTipo(unidadeTipo);
            produto.setPreco(preco);
            retorno = produtoDAO.inserir(produto);
        } catch (SQLException ex) {
            Logger.getLogger(ControleCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }
    
    public ArrayList<Produto> consultar(){
        ProdutoDAO produtoDAO = new ProdutoDAO();
        try {
            return produtoDAO.consultar();
        } catch (SQLException ex) {
            Logger.getLogger(ControleCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public boolean excluir(int COD_Produto){
        boolean retorno = false;
        try{
           ProdutoDAO produtoDAO = new ProdutoDAO();
           Produto produto = new Produto();
           produto.setCodigo(COD_Produto);
           produtoDAO.excluir(produto);
           retorno = true;
        }catch(SQLException ex){
            Logger.getLogger(ControleCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }
    
    public boolean alterar(int COD_Produto, String Descricao, String unidade, String unidadeTipo, float preco){
        boolean retorno = false;
        try{
           ProdutoDAO produtoDAO = new ProdutoDAO();
           Produto produto = new Produto();
           produto.setCodigo(COD_Produto);
           produto.setDescricao(Descricao);
           produto.setUnidade(unidade);
           produto.setUnidadeTipo(unidadeTipo);
           produto.setPreco(preco);
           produtoDAO.alterar();
        }catch(SQLException ex){
            Logger.getLogger(ControleCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }
}
