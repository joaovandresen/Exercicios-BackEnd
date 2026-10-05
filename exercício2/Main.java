package exercício2;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Maria Silva", 500.0);

        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo inicial: R$ " + conta.getSaldo());

        conta.depositar(150.0);
        System.out.println("Saldo atual: R$ " + conta.getSaldo());

        conta.sacar(200.0);
        System.out.println("Saldo atual: R$ " + conta.getSaldo());

        conta.sacar(1000.0);
    }
}