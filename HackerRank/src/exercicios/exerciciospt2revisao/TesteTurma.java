package exercicios.exerciciospt2revisao;

public class TesteTurma {
    public static void main(String[] args) {
        Turma turma = new Turma();

        turma.matricular(new Aluno("Ana", 8.5));
        turma.matricular(new Aluno("Bruno", 6.0));
        turma.matricular(new Aluno("Carla", 9.2));

        System.out.println("Média da turma: " + turma.calcularMedia());

        Aluno melhor = turma.encontrarMelhorAluno();
        System.out.println("Melhor aluno: " + melhor.getNome() + " (" + melhor.getNota() + ")");
    }
}