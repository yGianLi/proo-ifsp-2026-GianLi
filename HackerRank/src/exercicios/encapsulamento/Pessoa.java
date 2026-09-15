package exercicios.encapsulamento;

public class Pessoa {
    private String nome1;
    private int idade;

    public Pessoa(String nome1, int idade) {
        nome1 = nome1;
        idade = idade;
    }

    public String getNome1() {
        return this.nome1;
    }

    public int getIdade() {
        return this.idade;
    }
}
