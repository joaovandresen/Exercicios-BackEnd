package exercício5;

public class TestaProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Poco C75", 1500, 10);
        produto.adicionarEstoque(5);
        produto.removerEstoque(2);
        System.out.println(produto.getQuantidadeEstoque());
    }
}