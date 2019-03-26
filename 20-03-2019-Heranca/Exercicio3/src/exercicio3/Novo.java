
package exercicio3;

public class Novo extends Imovel{
    private float precoAdc;
    
    public Novo(int cod, String end, float preco, float precoAdc){
        super(cod, end, preco);
        this.precoAdc = precoAdc;
    }
    
    public float getPrecoAdc() {
        return precoAdc;
    }

    public void setPrecoAdc(float precoAdc) {
        this.precoAdc = precoAdc;
    }
    
    public void retornoPrecoAdc(float precoAdc){
        this.precoAdc = precoAdc;
        this.setPreco(this.getPreco() - precoAdc);
        System.out.println("Preço adicional: " + precoAdc);
    }
}
