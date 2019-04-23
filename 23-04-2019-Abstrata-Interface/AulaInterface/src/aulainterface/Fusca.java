package aulainterface;

public class Fusca implements Carro, ItemCaro{

    @Override
    public void abrirPorta() {
        System.out.println("O fusca abriu a porta");
    }

    @Override
    public void virarEsquerda() {
        System.out.println("O fusca virou a esquerda");
        System.out.println("Fusca conversível");
    }

    @Override
    public void virarDireita() {
        System.out.println("O fusca virou a direita");
        System.out.println("Fusca conversível");
    }

    @Override
    public void acelerar() {
        System.out.println("O fusca acelerou");
        System.out.println("O fusca perdeu o motor");
    }

    @Override
    public double getPreco() {
        double imposto = 500;
        return (76000 + imposto);
    }
    
}
