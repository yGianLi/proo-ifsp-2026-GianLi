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


}


