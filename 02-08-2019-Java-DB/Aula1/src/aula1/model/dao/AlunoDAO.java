package aula1.model.dao;

import aula1.connection.Conexao;
import aula1.model.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlunoDAO {
    Connection con = null;
    
    public boolean inserir(Aluno aluno) throws SQLException{
        boolean inseriu = false;
        try{
            con        = new Conexao().getConnection();
            String sql = "INSERT INTO Alunos (RA, NOME) values (?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, aluno.getRA());
            stmt.setString(2, aluno.getNome());
            stmt.execute();
            stmt.close();
            inseriu = true;
        }catch (Exception ex){
            ex.printStackTrace();
        }finally{
            con.close();
        }
        return  inseriu;
    } 
}
