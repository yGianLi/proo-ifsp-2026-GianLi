package exercicios.encapsulamento;

public class Livro {
    private String titulo;
    private int paginas;

    public Livro(String titulo, int paginas) {
        this.titulo = titulo;
        this.paginas = paginas;
    }

    public Livro() {
        this.titulo = "Sem título";
        this.paginas = 0;
    }

    @Override // serve para informar ao compilador que você está sobrescrevendo um método que já existe na classe pai (superclasse) ou em uma interface.
    public String toString() {
        return "Livro: " + titulo + " | Páginas: " + paginas;
    }
}



