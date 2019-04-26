package exercicios_1;

public class Circulo implements AreaCalculavel {
    private double raio;
    
    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double calcularArea() {
        return  3.14d * ( raio * raio );
    }
}
