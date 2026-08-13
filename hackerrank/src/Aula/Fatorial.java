package Aula;

import java.util.Scanner;

public class Fatorial {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        Integer n = scan.nextInt();
        Integer fatorial = 1;
        for(int i = 1; i <= n; i++){
            fatorial = fatorial * i;

        }
        System.out.println("Valor fatorial do numero: " + fatorial);


    }


}
