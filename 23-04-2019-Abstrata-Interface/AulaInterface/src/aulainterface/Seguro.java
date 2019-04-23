package aulainterface;

public class Seguro implements ItemCaro {
    private static final double PRECO = 10000;
    
    @Override
    public double getPreco() {
        return PRECO;
    }
    
}
