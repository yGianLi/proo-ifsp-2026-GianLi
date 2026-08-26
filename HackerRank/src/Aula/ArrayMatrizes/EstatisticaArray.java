package Aula.ArrayMatrizes;

import java.util.Scanner;

public class EstatisticaArray {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int cont = 0;
        int [] valores = new int[5];

        for (int i = 0; i < valores.length; i++){
            System.out.print("Digite o valor" + (i + 1) + ": ");
            valores[i] = teclado.nextInt();
        }

        int soma = valores[0];
        int maior = valores[0];
        for(int j = 0; j < valores.length; j++){
            soma += valores[j];
            if(valores[j] > maior){
                maior = valores[j];
            }
        }

        double media = (double) soma / valores.length;

        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);
        System.out.println("Maior elemento: " + maior);

    }
}
