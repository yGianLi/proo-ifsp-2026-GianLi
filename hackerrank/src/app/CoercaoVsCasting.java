package app;

public class CoercaoVsCasting {
    public static void main(String[] args){
        long populacaoCidade = 1_500_000; // (1)

        int votosApurados = 1_499_499;
        long totalGeral = votosApurados; // (2)

        float mediaNotas = 8; // (3)
        double notaFinal = mediaNotas; // (4)

        double saldoConta = 2500.75;
        long saldoEmCentavosAproximado = (long) (saldoConta * 100); // (5)

        int quantidadeItens = 10;
        float precoUnitario = 3.5f;
        float totalCompra = quantidadeItens * precoUnitario; // (6)

        double mediaFinal = 7.8;
        int mediaParaAprovacao = (int) mediaFinal; // (7)

        System.out.println("populacaoCidade = " + populacaoCidade);
        System.out.println("totalGeral = " + totalGeral);
        System.out.println("notaFinal = " + notaFinal);
        System.out.println("saldoEmCentavosAproximado = " + saldoEmCentavosAproximado);
        System.out.println("totalCompra = " + totalCompra);
        System.out.println("mediaParaAprovacao = " + mediaParaAprovacao);

    }


}
