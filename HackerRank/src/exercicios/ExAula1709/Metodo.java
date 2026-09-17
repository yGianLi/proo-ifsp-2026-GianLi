package exercicios.ExAula1709;

public class Metodo {

    public static double media(double [] valores){
        double soma = valores[0];
            for (int i = 1; i < valores.length; i++){
                soma += valores[i];
            }
        return soma/ valores.length;
    }

    public static double Variancia(double[]valores){
        double media = Metodo.media(valores);
        double somaDiferencasQuadrado = 0.0;
        for (double v : valores) {
            somaDiferencasQuadrado += Math.pow(v - media, 2);
        }
        return somaDiferencasQuadrado / valores.length;
    }

    public static double DesvioPadrao(double[]valores){
        double variancia = Metodo.Variancia(valores);
        return Math.sqrt(variancia);
    }

}
