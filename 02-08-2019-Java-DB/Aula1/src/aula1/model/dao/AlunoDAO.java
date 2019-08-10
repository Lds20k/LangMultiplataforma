package aula1.model.dao;

import aula1.connection.Conexao;
import aula1.model.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AlunoDAO {
    Connection con = null;
    public ArrayList<Aluno> getAlunos() throws SQLException, ClassNotFoundException{
        ArrayList<Aluno> alunos = new ArrayList<>();
        ResultSet resultado = null;
        try {
            con = new Conexao().getConnection();
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM Alunos");
            resultado = stmt.executeQuery();
            while(resultado.next()){
                Aluno aluno = new Aluno(resultado.getInt("RA"), resultado.getString("NOME"));
                alunos.add(aluno);
            }
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            con.close();
            return alunos;
        }
    }
    
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
