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
        }
    }

    public void adicionarEstoque(int quantidade) {
        quantidadeEstoque = quantidadeEstoque + quantidade;
    }

    public void removerEstoque(int quantidade) {
        if (quantidade <= quantidadeEstoque) {
            quantidadeEstoque = quantidadeEstoque - quantidade;
        }
    }
}