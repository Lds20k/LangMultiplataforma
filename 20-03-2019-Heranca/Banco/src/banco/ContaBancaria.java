package banco;

public class ContaBancaria {
    private String cliente;
    private int numConta;
    private double saldo;
    
    public void sacar(double quantidade){
        quantidade = quantidade - this.getSaldo();
        if( quantidade < this.getSaldo() ){
            setSaldo(quantidade);
        }
    }

    public String getCliente() {
        return this.cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
