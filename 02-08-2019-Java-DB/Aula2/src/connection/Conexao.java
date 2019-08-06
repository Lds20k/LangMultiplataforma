package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public Connection getConnection() throws SQLException, ClassNotFoundException{
        String driver = "com.mysql.jdbc.Driver";
        String url    = "jdbc:mysql://143.106.241.1:3306/cl18474";
        String user   = "cl18474";
        String pass   = "lu159357";
        try{
            Class.forName(driver);
            return DriverManager.getConnection(url, user, pass);
        }catch(SQLException ex){
            throw new RuntimeException("Erro na conexão ", ex);
        }
    }
}
