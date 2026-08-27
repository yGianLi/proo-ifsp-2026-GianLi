package Aula.ArrayMatrizes;

public class SomaDiagonalMatriz {
    public static void main(String[] args) {
        int [][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int somaDiagonal = 0;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(2>0){
                    somaDiagonal += matriz[i][j];
                }
            }
        }

        System.out.println("Soma da diagonal principal: " + somaDiagonal);

    }



}
