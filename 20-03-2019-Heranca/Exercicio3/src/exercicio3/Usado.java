
package exercicio3;

public class Usado extends Imovel{
    private float desconto;
       
    public Usado(int cod, String end, float preco, float desconto){
        super(cod, end, preco);
        this.desconto = desconto;
    }
    
     public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }
    
    public void retornoDesconto(float desconto){
        this.desconto = desconto;
        this.setDesconto(this.getDesconto() - desconto);
        System.out.println("Desconto: " + desconto);
    }
}
