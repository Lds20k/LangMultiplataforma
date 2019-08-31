/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pombocorreio.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author aluno
 */
public class Conexao {
    public Connection getConnection() throws SQLException, ClassNotFoundException{
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://143.106.241.1:3306/cl18474";
        String usuario = "cl18474";
        String senha = "cl*10072000";
        try{
            Class.forName(driver);
            return DriverManager.getConnection(url, usuario, senha);
        }
        catch(SQLException ex){
            throw new RuntimeException("Erro de conexao", ex);
        }
    }
}
