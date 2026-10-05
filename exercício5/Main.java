package exercício5;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Acer Nitro 5", 3400.0, 10);

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco());
        System.out.println("Estoque inicial: " + produto.getQuantidadeEstoque());

        produto.setPreco(-50.0);

        produto.adicionarEstoque(5);
        System.out.println("Estoque atual: " + produto.getQuantidadeEstoque());

        produto.removerEstoque(3);
        System.out.println("Estoque atual: " + produto.getQuantidadeEstoque());

        produto.removerEstoque(20);
    }
}