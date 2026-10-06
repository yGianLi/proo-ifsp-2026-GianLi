package exercicios.exerciciospt2revisao;

import java.util.ArrayList;

public class Turma {
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public void matricular(Aluno aluno) {
        alunos.add(aluno);
    }

    public double calcularMedia() {
        if (alunos.isEmpty()) {
            return 0;
        }

        double soma = 0;
        for (Aluno a : alunos) {
            soma += a.getNota();
        }
        return soma / alunos.size();
    }

    public Aluno encontrarMelhorAluno() {
        if (alunos.isEmpty()) {
            return null;
        }

        Aluno melhor = alunos.get(0);
        for (Aluno a : alunos) {
            if (a.getNota() > melhor.getNota()) {
                melhor = a;
            }
        }
        return melhor;
    }
}