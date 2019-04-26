package exercicios_1;

public class Exercicios_1 {

    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        Retangulo r1 = new Retangulo();
        Quadrado q1 = new Quadrado();
        
        c1.setRaio(3);
        
        r1.setAltura(5);
        r1.setBase(2);
        
        q1.setLado(4);
        
        System.out.println("Area do circulo: " + c1.calcularArea());
        System.out.println("Area do retangulo: " + r1.calcularArea());
        System.out.println("Area do quadrado: " + q1.calcularArea());
        
        FigurasGeometricas quad = new FigurasGeometricas();
        
        quad.setAltura(2);
        quad.setLargura(3);
        quad.colorirFigura("#1231");
        
        System.out.println("Area do quad: " + quad.calcularArea());
        
    }
    
}
