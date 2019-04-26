package exercicio_2;

public class Assalariado extends Empregrado {
    private double salario;
    
    public Assalariado(String nome, String sobrenome, String cpf, double salario){
        super(nome, sobrenome, cpf);
        this.salario = salario;
    }
    
    @Override
    public double vencimento() {
        return salario;
    }
}
