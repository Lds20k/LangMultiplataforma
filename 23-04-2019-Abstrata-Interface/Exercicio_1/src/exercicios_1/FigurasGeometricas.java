package exercicios_1;

public class FigurasGeometricas extends AreaCalculavelCB{
    private double altura;
    private double largura;
    
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
    
    @Override
    public double calcularArea(){
        return altura * largura;
    }
    
}
