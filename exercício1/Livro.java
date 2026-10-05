package exercício1;
public class Livro {
    public String titulo;
    public String autor;
    public int paginas;

    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void exibirDetalhes() {
        System.out.println("O livro " + titulo + ", escrito por " + autor + ", possui " + paginas + " páginas.");
    }
}