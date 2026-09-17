package exercicios.encapsulamento;

public class Calculadora {
    public int somar(int a, int b) {
        System.out.println("Chamando somar(int, int)");
        return a + b;
    }

    public int somar(int a, int b, int c) {
        System.out.println("Chamando somar(int, int, int)");
        return a + b + c;
    }

    public double somar(double a, double b) {
        System.out.println("Chamando somar(double, double)");
        return a + b;
    }

    public int somar(int... numeros) {
        System.out.println("Chamando somar(int...)");
        int soma = 0;
        for (int n : numeros) {
            soma += n;
        }
        return soma;
    }

}
