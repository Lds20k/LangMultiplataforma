package aula1.control;

import aula1.model.Aluno;
import aula1.model.dao.AlunoDAO;
import java.sql.SQLException;

public class ControleAluno {
    public boolean inserirAluno(int RA, String nome) throws SQLException{
        Aluno aluno = new Aluno(RA, nome);
        AlunoDAO alunoDAO = new AlunoDAO();
        boolean inseriu = alunoDAO.inserir(aluno);
        return inseriu;
    }
}
