package testafuncionarios;

public class TestaFuncionario {

    public static void main(String[] args) {
        Gerente ge1 = new Gerente("Dougla", 2000, "douglinhas", "123");
        Telefonista te1 = new Telefonista("Maria", 954, "122");
        Secretaria sc1 = new Secretaria("Nan", 1000, "100");
        
        ge1.calcularBonificacao();
        te1.calcularBonificacao();
        sc1.calcularBonificacao();
        
        ge1.mostrarDado();
        te1.mostrarDado();
        sc1.mostrarDado();
    }
    
}
