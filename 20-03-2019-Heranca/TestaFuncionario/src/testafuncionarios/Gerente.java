package testafuncionarios;

public class Gerente extends Funcionario{
    private String username;
    private String password;

    public Gerente(String nome, float salario, String username, String password) {
        super(nome, salario);
        this.username = username;
        this.password = password;
    }
    
    @Override
    public float calcularBonificacao(){
        float salario = getSalario();
        return salario+(salario * 0.12f);
    }
    
    @Override
    public void mostrarDado(){
        super.mostrarDado();
        System.out.println( "Username: " + username);
        System.out.println( "Password: " + password);
    }
    
}
