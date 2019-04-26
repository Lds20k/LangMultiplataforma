package exercicio_2;

public class Comissionado extends Empregrado{
    private double totalVenda;
    private double taxaComissao;

    public Comissionado(String nome, String sobrenome, String cpf, double totalVenda, double taxaComissao) {
        super(nome, sobrenome, cpf);
        this.totalVenda = totalVenda;
        this.taxaComissao = taxaComissao;
    }

    public double getTotalVenda() {
        return totalVenda;
    }
    
    @Override
    public double vencimento() {
        return getTotalVenda() * taxaComissao;
    }
}
