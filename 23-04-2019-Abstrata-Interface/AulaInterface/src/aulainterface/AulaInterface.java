package aulainterface;

public class AulaInterface {

    public static void main(String[] args) {
        BMW BMWvermelha = new BMW();
        BMWvermelha.acelerar();
        double preco = BMWvermelha.getPreco();
        System.out.println("A BMW custa " + preco);
        
        Fusca fuscaAzul = new Fusca();
        fuscaAzul.virarEsquerda();
        fuscaAzul.abrirPorta();
        preco = fuscaAzul.getPreco();
        System.out.println("O fusca custa " + preco);
    }
    
}
