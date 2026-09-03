package Roteiros;

public class OlaMundo {
    public static void main(String[] args) {

        // Atividade 2
        System.out.println("Meu Jogo favorito é Minecraft");
        System.out.println("Meu Artista favorito é Veigh");

        // 1. Declaração e inicialização dos tipos primitivos

        int idade = 18;
        float altura = 1.75f;
        double salario = 2500.50;
        char inicial = 'G';
        boolean gostaDeMinecraft = true;
        long populacao = 8000000000L;
        byte nivel = 10;
        short ano = 2026;

        // Exibindo os valores
        System.out.println("\nTipos primitivos:");
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Salário: " + salario);
        System.out.println("Inicial: " + inicial);
        System.out.println("Gosta de Minecraft: " + gostaDeMinecraft);
        System.out.println("População: " + populacao);
        System.out.println("Nível: " + nivel);
        System.out.println("Ano: " + ano);

        // 2. Operadores aritméticos

        int a = 20;
        int b = 5;

        System.out.println("\nOperadores aritméticos:");
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));

        // Operadores lógicos/de comparação

        System.out.println("\nOperadores de comparação:");
        System.out.println("a < b: " + (a < b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a == b: " + (a == b));

        // Utilizando boolean
        System.out.println("\nBoolean:");
        System.out.println("Gosta de Minecraft? " + gostaDeMinecraft);


        /*
         * 3. ERROS PROPOSITAIS
         *
         * Descomente um erro por vez para observar a mensagem
         * apresentada pelo IntelliJ.
         */

        // ERRO 1: tentar colocar texto em uma variável int
        // int numero = "dez";

        // ERRO 2: tentar colocar um número decimal em um int
        // int numeroDecimal = 10.5;

        // ERRO 3: usar uma variável que não foi declarada
        // System.out.println(numeroInexistente);
    }
}