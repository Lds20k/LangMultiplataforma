package banco;

public class Banco {
    public static void main(String[] args) {
        ContaBancaria conB1 = new ContaBancaria();
        ContaPoupanca conP1 = new ContaPoupanca();
        ContaEspecial conE1 = new ContaEspecial();
        
        conB1.setCliente("Lucas");
        conB1.setNumConta(111);
        conB1.setSaldo(1000);
        conB1.depositar(10);
        conB1.sacar(5);
        
        System.out.println("Nome: " + conB1.getCliente());
        System.out.println("Numero da conta: " + conB1.getNumConta());
        System.out.println("Saldo: " + conB1.getSaldo());
        
        conP1.setCliente("Caio");
        conP1.setNumConta(222);
        conP1.setSaldo(2000);
        conP1.depositar(10);
        conP1.sacar(5);
        
        System.out.println("Nome: " + conP1.getCliente());
        System.out.println("Numero da conta: " + conP1.getNumConta());
        System.out.println("Saldo: " + conP1.getSaldo());
        conP1.calcularNovoSaldo(2);
        System.out.println("Saldo novo: " + conP1.getSaldo());
        
        conE1.setCliente("Bruno");
        conE1.setNumConta(333);
        conE1.setSaldo(1);
        conE1.depositar(10);
        conE1.sacar(5);
        
        System.out.println("Nome: " + conE1.getCliente());
        System.out.println("Numero da conta: " + conE1.getNumConta());
        System.out.println("Saldo: " + conE1.getSaldo());
        
    }
    
}
