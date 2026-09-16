package exercicios.encapsulamento;

public class Retangulo {
    private double base;
    private double altura;

    public Retangulo() {
        this(1, 1); //
    }

    public Retangulo(double lado) {
        this(lado, lado); //
    }
    //public Retangulo(double altura) {
     //   this(altura, altura); //
    //}

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }
}
