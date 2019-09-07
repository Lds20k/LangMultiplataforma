/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pombocorreio.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import pombocorreio.conexao.Conexao;
import pombocorreio.modelo.Produto;

/**
 *
 * @author aluno
 */
public class ProdutoDAO {
    Connection con = null;
    
    public boolean inserir(Produto prod) throws SQLException{
        boolean inseriu = false;
        try{
            con = new Conexao().getConnection();
            String sql = "INSERT INTO Produto (Unidade, Unidade_Tp, Preco, Descricao)"
                                   + " VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, prod.getUnidade());
            stmt.setString(2, prod.getUnidadeTipo());
            stmt.setFloat(3, prod.getPreco());
            stmt.setString(4, prod.getDescricao());
            stmt.execute();
            inseriu = true;
        }
        catch(ClassNotFoundException | SQLException ex){
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            con.close();
        }
        return inseriu; 
    }
    
    public ArrayList<Produto> consultar() throws SQLException{
        ArrayList<Produto> produtos = new ArrayList<>();
        try {
            con = new Conexao().getConnection();
            String sql = "SELECT * FROM Produto";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.execute();
            ResultSet resultado = stmt.getResultSet();
            while(resultado.next()){
                Produto produto = new Produto();
                produto.setCodigo(resultado.getInt("COD_Produto"));
                produto.setUnidade(resultado.getString("Unidade"));
                produto.setUnidadeTipo(resultado.getString("Unidade_Tp"));
                produto.setPreco(resultado.getFloat("Preco"));
                produto.setDescricao(resultado.getString("Descricao"));
                produtos.add(produto);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return produtos;
    }
    
    public boolean excluir(Produto produto) throws SQLException{
        boolean excluiu = false;
        try{
            con = new Conexao().getConnection();
            String sql = "DELETE FROM Produto WHERE COD_Produto = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, produto.getCodigo());
            stmt.execute();
        }
        catch(ClassNotFoundException | SQLException ex){
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return excluiu;
    }

    public boolean alterar(Produto produto) throws SQLException{
        boolean alterou = false;
        try{
            con = new Conexao().getConnection();
            String sql = "UPDATE Produto SET Unidade = ?, Unidade_Tp = ?, Preco = ?, Descricao = ? WHERE COD_Produto = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, produto.getUnidade());
            stmt.setString(2, produto.getUnidadeTipo());
            stmt.setFloat(3, produto.getPreco());
            stmt.setString(4, produto.getDescricao());
            stmt.setInt(5, produto.getCodigo());
            stmt.execute();
            alterou = true;
        }
        catch(ClassNotFoundException | SQLException ex){
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alterou;
    }
    
}
