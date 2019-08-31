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
import pombocorreio.modelo.Cliente;

/**
 *
 * @author aluno
 */
public class ClienteDAO {
    Connection con = null;
    
    public boolean inserir(Cliente al) throws SQLException{
        boolean inseriu = false;
        try{
            con = new Conexao().getConnection();
            String sql = "INSERT INTO Cliente (CPF, Telefone_Resi, Telefone_Celu, Nome, Email, Numero, Rua, Bairro, Cidade, Estado)"
                                   + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, al.getCPF());
            stmt.setString(2, al.getTelefone_Resi());
            stmt.setString(3, al.getTelefone_Celu());
            stmt.setString(4, al.getNome());
            stmt.setString(5, al.getEmail());
            stmt.setString(6, al.getNumero());
            stmt.setString(7, al.getRua());
            stmt.setString(8, al.getBairro());
            stmt.setString(9, al.getCidade());
            stmt.setString(10, al.getEstado());
            stmt.execute();
            stmt.close();
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
    
    public boolean excluir(Cliente cl) throws SQLException, ClassNotFoundException{
        boolean excluiu = false;
        try{
            con = new Conexao().getConnection();
            String sql = "DELETE FROM Cliente WHERE ID_Cliente = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            
        }
        catch(SQLException ex){
            
        }
    }
}
