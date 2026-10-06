package exercicios.exerciciospt2revisao;

public class Aluno {
    private String nome;
    private double nota;

    // Construtor Aluno(String nome, double nota)
    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    // getNome()
    public String getNome() {
        return nome;
    }

    // getNota()
    public double getNota() {
        return nota;
    }
}
