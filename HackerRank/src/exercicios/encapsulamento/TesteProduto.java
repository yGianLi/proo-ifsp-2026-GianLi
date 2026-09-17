package exercicios.encapsulamento;

public class TesteProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        Pessoa pessoa = new Pessoa("João", 20);
        Pessoa pessoa2 = new Pessoa(pessoa);
        Livro l1 = new Livro("Dom Casmurro", 256);

        System.out.println("-----------");

        ContaBancaria conta = new ContaBancaria("Gian");

        conta.depositar(100);
        System.out.println("Saldo após depósito de 100: " + conta.getSaldo());

        conta.depositar(50);
        System.out.println("Saldo após depósito de 50: " + conta.getSaldo());

        conta.depositar(-30);
        System.out.println("Saldo após tentativa de depósito de -30: " + conta.getSaldo());

        System.out.println("-----------");

        Calculadora calc = new Calculadora();

        System.out.println(calc.somar(3, 4));                 // 0 argumentos extras -> deve chamar somar(int, int)
        System.out.println(calc.somar());                     // 0 argumentos -> varargs
        System.out.println(calc.somar(5));                    // 1 argumento -> varargs
        System.out.println(calc.somar(1, 2, 3, 4));           // 4 argumentos -> varargs
        System.out.println(calc.somar(1, 2, 3, 4, 5, 6));     // 6 argumentos -> varargs


        System.out.println(calc.somar(2, 3));         // chama somar(int, int)
        System.out.println(calc.somar(2, 3, 4));       // chama somar(int, int, int)
        System.out.println(calc.somar(2.5, 3.5));      // chama somar(double, double)

        System.out.println("-----------");

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
