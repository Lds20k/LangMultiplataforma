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
            try (PreparedStatement stmt = con.prepareStatement(sql)) {
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
            }
            inseriu=true;
        }
        catch(ClassNotFoundException | SQLException ex){
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            con.close();
        }
        return inseriu; 
    }
    
    public ArrayList<Cliente> consultar() throws SQLException{
        ArrayList<Cliente> clientes = new ArrayList<>();
        try {
            con = new Conexao().getConnection();
            String sql = "SELECT * FROM Cliente";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.execute();
            ResultSet resultado = stmt.getResultSet();
            while(resultado.next()){
                Cliente cliente = new Cliente();
                cliente.setID(resultado.getInt("ID_Cliente"));
                cliente.setCPF(resultado.getString("CPF"));
                cliente.setTelefone_Resi(resultado.getString("Telefone_Resi"));
                cliente.setTelefone_Celu(resultado.getString("Telefone_Celu"));
                cliente.setNome(resultado.getString("Nome"));
                cliente.setEmail(resultado.getString("Email"));
                cliente.setNumero(resultado.getString("Numero"));
                cliente.setRua(resultado.getString("Rua"));
                cliente.setBairro(resultado.getString("Bairro"));
                cliente.setCidade(resultado.getString("Cidade"));
                cliente.setEstado(resultado.getString("Estado"));
                clientes.add(cliente);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clientes;
    }
    
    public boolean excluir(Cliente cl) throws SQLException{
        boolean excluiu = false;
        try{
            con = new Conexao().getConnection();
            String sql = "DELETE FROM Cliente WHERE ID_Cliente = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, cl.getID());
            stmt.execute();
        }
        catch(ClassNotFoundException | SQLException ex){
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return excluiu;
    }
}
