package exercicios.encapsulamento;

public class TesteProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        Pessoa pessoa = new Pessoa("João", 20);


        p1.setNome("Batata");
        p1.setPreco(-50);

        System.out.println(p1.getNome());
        System.out.println(p1.getPreco());

        System.out.println(pessoa.getNome1());
        System.out.println(pessoa.getIdade());
    }
}
