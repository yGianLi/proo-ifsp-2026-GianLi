package exercicios.ExAula1709;

public class quadrado {

    public static boolean isQuadradoMagico(int [][] matriz){
        int n = matriz.length;
        int somaRef = 0;
        for(int i = 0; i < n; i++){
            somaRef += matriz[0][i];
        }
        // aqui ele checa todas as linhas
        for(int i = 0; i < n; i++){
            int somaLinha = 0;
            for(int j = 0; j < n; j++){
                somaLinha += matriz[i][j];
            }
            if(somaLinha != somaRef){
                return false;
            }
        }
        // aqui ele checa todas as colunas
        for(int j = 0; j < n; j++){
            int somaColuna = 0;
            for(int i = 0; i < n; i++){
                somaColuna += matriz[i][j];
            }
            if(somaColuna != somaRef){
                return false;
            }
        }
        // aqui ele checa a diagonal
        int SomaDiagonal = 0;
        for(int i = 0; i < n; i++ ){
            SomaDiagonal += matriz[i][i];
        }
        if(SomaDiagonal != somaRef){
            return false;
        }
        // aqui ele checa a diagonal reversa
        int SomaDiagonalReversa = 0;
        for(int j = 0; j < n; j++){
            SomaDiagonalReversa += matriz[j][n-1-j];
        }
        if(SomaDiagonalReversa != somaRef){
            return false;
        }

        // se passou por tudo, vai dar true;
        return true;
    }

}
