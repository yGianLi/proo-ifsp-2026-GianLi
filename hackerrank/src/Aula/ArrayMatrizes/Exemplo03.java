package Aula.ArrayMatrizes;

public class Exemplo03 {
    public static void main(String[] args) {
        // ragged arrays (Matriz irregular!!)
        int [][] valores = new int[3][];
        valores[0] = new int[3];
        valores[1] = new int[2];
        valores[2] = new int[4];
        for(int i = 0; i < valores.length; i++){
            for(int j = 0; j < valores[i].length; j++){
                System.out.print(valores[i][j] + " ");
            }
            System.out.println();
        }
        // ArrayList -> permite alocação dinâmica
    }
}
