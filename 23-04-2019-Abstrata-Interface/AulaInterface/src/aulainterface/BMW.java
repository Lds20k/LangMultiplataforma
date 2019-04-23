package aulainterface;

public class BMW implements Carro, ItemCaro{
    private static final double PRECO = 100000.00;
    
    @Override
    public void abrirPorta() {
        System.out.println("A porta da BMW abriu");
    }

    @Override
    public void virarEsquerda() {
        System.out.println("A BMW virou esquerda");
    }

    @Override
    public void virarDireita() {
        System.out.println("A BMW virou direita");
    }

    @Override
    public void acelerar() {
        System.out.println("A BWM acelerou");
    }

    @Override
    public double getPreco() {
        return PRECO;
    }
    
}
