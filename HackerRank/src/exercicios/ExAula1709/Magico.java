package exercicios.ExAula1709;

public class Magico {
    public static void main(String[] args) {
        int[][] matriz = {
                {2, 9, 4},
                {7, 5, 3},
                {6, 1, 8}};
        int[][] matriz2 = {
                {2, 9, 4},
                {5, 5, 3},
                {6, 1, 8}};

        if (quadrado.isQuadradoMagico(matriz)) {
            System.out.println("É um quadrado mágico");
        } else {
            System.out.println("Não é um quadrado mágico");
        }
        if (quadrado.isQuadradoMagico(matriz2)) {
            System.out.println("É um quadrado mágico");
        } else {
            System.out.println("Não é um quadrado mágico");
        }

    }
}