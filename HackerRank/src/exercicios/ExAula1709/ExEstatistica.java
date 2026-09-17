package exercicios.ExAula1709;

// Criar a classe Estatistica e os métodos estátisticos:
// a) double media(double [] valores)
// b) double variancia(double [] valores)
// c) double desvioPadrao(double [] valores)

public class ExEstatistica {
    public static void main(String[] args) {
        double [] valores = {10,20,30,40,50};

        System.out.println(Metodo.media(valores));
        System.out.println(Metodo.Variancia(valores));
        System.out.println(Metodo.DesvioPadrao(valores));

    }




}
