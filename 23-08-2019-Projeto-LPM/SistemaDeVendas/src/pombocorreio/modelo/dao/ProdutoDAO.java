/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pombocorreio.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
            inseriu=true;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            con.close();
        }
        return inseriu; 
    }
}
