package exercício4;

public class Gerente extends Funcionario {
    private String departamento;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void gerenciar() {
        System.out.println("Gerente " + getNome() + " no setor " + departamento);
    }
}