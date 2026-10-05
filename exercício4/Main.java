package exercício4;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("João Victor", 3500.0, "Técnico em Desenvolvimento de SIstemas");

        gerente.gerenciar();
        System.out.println("Salário inicial: R$ " + gerente.getSalario());

        gerente.aumentarSalario(10);
        System.out.println("Salário após aumento: R$ " + gerente.getSalario());
    }
}