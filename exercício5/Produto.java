package exercício5;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: O preço do produto não pode ser negativo");
        }
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            quantidadeEstoque += quantidade;
            System.out.println(quantidade + " unidades adicionadas ao estoque.");
        }
    }

    public void removerEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= quantidadeEstoque) {
            quantidadeEstoque -= quantidade;
            System.out.println(quantidade + " unidades removidas do estoque.");
        } else {
            System.out.println("Erro: Estoque insuficiente");
        }
    }
}