package aula1.model.dao;

import aula1.connection.Conexao;
import aula1.model.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AlunoDAO {
    Connection con = null;
    
    public ArrayList<Aluno> getAlunos() throws SQLException{
        ArrayList<Aluno> alunos = new ArrayList<>();
        ResultSet resultado = null;
        try {
            con = new Conexao().getConnection();
            String SQL = "SELECT * FROM Alunos ORDER BY Nome";
            
            PreparedStatement stmt = con.prepareStatement(SQL);
            resultado = stmt.executeQuery();
            while(resultado.next()){
                Aluno aluno = new Aluno(resultado.getInt("RA"), resultado.getString("Nome"), resultado.getString("Linguagem"), resultado.getInt("Status"));
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
    
    public void deletar(int RA) throws SQLException{
        try {
            con = new Conexao().getConnection();
            PreparedStatement stmt = con.prepareStatement("DELETE FROM Alunos WHERE RA = ?");
            stmt.setInt(1, RA);
            stmt.executeUpdate();
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            
        }
    }
    
    public boolean inserir(Aluno aluno) throws SQLException{
        boolean inseriu = false;
        try{
            con        = new Conexao().getConnection();
            String sql = "INSERT INTO Alunos (RA, Nome, Linguagem, Status) values (?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, aluno.getRA());
            stmt.setString(2, aluno.getNome());
            stmt.setString(3, aluno.getLinguagem());
            stmt.setInt(4, aluno.getStatus());
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
