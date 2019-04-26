package exercicio_3;

public class Cheque implements TipoPagamento{
    private double valor;
    
    public Cheque(double valor){
        this.valor = valor;
        if(valor < 1) {
            IllegalArgumentException erro = new IllegalArgumentException();
            throw erro;
        }
    }
    
    @Override
    public int getDiasFaturamento() {
        return 3;
    }

    @Override
    public int getPorcentagemFinanceiraPaga() {
        return 3;
    }
}
