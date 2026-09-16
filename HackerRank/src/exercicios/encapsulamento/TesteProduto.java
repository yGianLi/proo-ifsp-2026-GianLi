package exercicios.encapsulamento;

public class TesteProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        Pessoa pessoa = new Pessoa("João", 20);
        Pessoa pessoa2 = new Pessoa(pessoa);
        Livro l1 = new Livro("Dom Casmurro", 256);

        System.out.println("p1: " + pessoa.getNome() + ", " + pessoa.getIdade());
        System.out.println("p2: " + pessoa2.getNome() + ", " + pessoa2.getIdade());

        pessoa2.setNome("Joana");
        pessoa2.setIdade(30);

        System.out.println("-----------");
        System.out.println("p1: " + pessoa.getNome() + ", " + pessoa.getIdade());
        System.out.println("p2: " + pessoa2.getNome() + ", " + pessoa2.getIdade());

        //p1.setNome("Batata");
        //p1.setPreco(-50);
        System.out.println("-----------");
        // Teste Retangulo

        Retangulo r1 = new Retangulo();
        Retangulo r2 = new Retangulo(5);
        Retangulo r3 = new Retangulo(4, 6);

        System.out.println("r1 (padrão): área = " + r1.calcularArea());
        System.out.println("r2 (quadrado): área = " + r2.calcularArea());
        System.out.println("r3 (base/altura): área = " + r3.calcularArea());

        //System.out.println(p1.getNome());
        //System.out.println(p1.getPreco());

        //System.out.println(pessoa.getNome1());
        //System.out.println(pessoa.getIdade());
        System.out.println(l1);
    }
}
