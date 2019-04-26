package exercicios_1;

public abstract class AreaCalculavelCB {
    private String cor;
    public abstract double calcularArea();
    public void colorirFigura(String cor){
        this.cor = cor;
    }
}
