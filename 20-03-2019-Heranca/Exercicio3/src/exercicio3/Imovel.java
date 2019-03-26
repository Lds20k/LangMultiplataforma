package exercicio3;


public class Imovel {
    private int codigo;
    private String endereco;
    private float preco;
    
    public Imovel(){
        codigo = 0;
        endereco = "NULL";
        preco = 0;
    }
    
    public Imovel(int cod, String end, float preco){
        this.codigo = cod;
        this.endereco = end;
        this.preco = preco;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
    
}
