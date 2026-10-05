package exercício4;

public class TestaFuncionario {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("Francisco");
        gerente.setSalario(3000);
        gerente.setDepartamento("TI");
        gerente.gerenciar();
    }
}