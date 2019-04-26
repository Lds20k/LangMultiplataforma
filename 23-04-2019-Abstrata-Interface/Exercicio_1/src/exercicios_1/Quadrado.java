package exercicios_1;

public class Quadrado implements AreaCalculavel {
    private double lado;
    
    public void setLado(double lado) {
        this.lado = lado;
    }
    @Override
    public double calcularArea() {
        return lado*lado;
    }
    
}
