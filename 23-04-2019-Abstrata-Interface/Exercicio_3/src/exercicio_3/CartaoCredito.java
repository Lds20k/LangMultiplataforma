package exercicio_3;

public class CartaoCredito implements TipoPagamento {
    private double valor;
    
    public CartaoCredito(double valor){
        this.valor = valor;
        try{
            if(valor < 1) {
                IllegalArgumentException erro = new IllegalArgumentException();
                throw erro;
            }
        }catch(IllegalArgumentException e){
            System.out.println("Valor invalido: " + valor);
        }
    }
    
    @Override
    public int getDiasFaturamento() {
        return 20;
    }

    @Override
    public int getPorcentagemFinanceiraPaga(){
        return 10;
    }
    
}
