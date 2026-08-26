package Aula.ArrayMatrizes;

public class Exemplo02 {
    public static void main(String[] args) {
        // int [][] valores = new int[3][3];

        int [][] valores = {
                {1,2,3},
                {4,5,6},
                {7,8,9} };

        for(int linha = 0; linha < valores.length; linha++){
            for(int coluna = 0; coluna < valores[linha].length; coluna++){
                System.out.print(valores[linha][coluna] + " ");
            }
            System.out.println();}


    }

}
