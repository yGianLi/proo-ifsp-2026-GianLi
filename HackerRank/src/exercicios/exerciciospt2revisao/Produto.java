package exercicios.exerciciospt2revisao;

public class Produto {
    private String nome;
    private double preco;

    // Construtor Produto(String nome, double preco)
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // getNome()
    public String getNome() {
        return nome;
    }

    // getPreco()
    public double getPreco() {
        return preco;
    }
}
