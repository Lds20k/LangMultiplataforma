package exercicios_1;

public class Retangulo implements AreaCalculavel {
    private double base;
    private double altura;
    
    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return base*altura;
    }
    
}
