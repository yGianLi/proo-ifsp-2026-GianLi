package Aula.ArrayMatrizes;

import java.util.Arrays;

public class Atividade_Matriz_Par_Impar {
    public static void main(String[] args) {
        int [] numero = {1, 2, 3, 4, 5, 6, 7};
        int[] par = new int[3];
        int[] impar = new int[4];
        int x = 0;
        int y = 0;
        for(int i = 0; i < numero.length; i++){
            if(numero[i] % 2 == 0){
                par[x] = numero[i];
                x++;
            }else{
                impar[y] = numero[i];
                y++;
            }

        }
        System.out.println(Arrays.toString(par));
        System.out.println(Arrays.toString(impar));

    }

}