package aula1.control;

import aula1.model.Aluno;
import aula1.model.dao.AlunoDAO;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControleAluno {
    
    public ArrayList pegarAlunos() throws SQLException, ClassNotFoundException{
        AlunoDAO alunodao = new AlunoDAO();
        return alunodao.getAlunos();
    }
    
    public boolean inserirAluno(int RA, String nome) throws SQLException{
        Aluno aluno = new Aluno(RA, nome);
        AlunoDAO alunodao = new AlunoDAO();
        boolean inseriu = alunodao.inserir(aluno);
        return inseriu;
    }
}
