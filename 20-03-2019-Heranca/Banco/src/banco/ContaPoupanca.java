package banco;

public class ContaPoupanca extends ContaBancaria{
    private int diaRendimento;
    
    public void calcularNovoSaldo(int rend){
        diaRendimento = rend;
        this.setSaldo((this.getSaldo()*((double)rend/100))+this.getSaldo());
    }
}
