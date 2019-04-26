package exercicio_3;

public class Dinheiro implements TipoPagamento {
    private double valor;
    
    public Dinheiro(double valor){
        this.valor = valor;
        if(valor < 1) {
            IllegalArgumentException erro = new IllegalArgumentException();
            throw erro;
        }
    }
    
    @Override
    public int getDiasFaturamento() {
        return 0;
    }

    @Override
    public int getPorcentagemFinanceiraPaga() {
        return 0;
    }
}
