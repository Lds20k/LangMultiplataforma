package banco;

public class ContaEspecial extends ContaBancaria{
    private float limite;
    
    @Override
    public void sacar(double quantidade){
        quantidade = this.getSaldo() - quantidade;
        if( quantidade > limite ){
            setSaldo(quantidade);
        }
    }
}
