package exercício2;
public class TestaConta {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Maria", 1000);
        conta.depositar(500);
        conta.sacar(200);
        System.out.println(conta.getSaldo());
    }
}