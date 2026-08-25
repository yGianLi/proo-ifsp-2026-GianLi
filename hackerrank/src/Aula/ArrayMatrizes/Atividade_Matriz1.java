package Aula.ArrayMatrizes;

import java.util.Arrays;

public class Atividade_Matriz1 {
    // matriz = arrays de arrays

    public static void main(String[] args) {

        int [] numeros = {10, 20, 30, 40, 50};
        int tam = numeros.length;

        for(int i = 1; i <= tam; i++){
            System.out.print(numeros[tam - i] + " ");
        }



    }

}
