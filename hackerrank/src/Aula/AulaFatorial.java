package Aula;

import java.math.BigInteger;
import java.util.Scanner;


public class AulaFatorial {


    public static Integer fatorial(Integer n){
        Integer fat = 1;


        for(Integer i = 1; i <= n; i++){
            fat = fat * i;
        }

        return fat;
    }

    public static BigInteger bigFatorial(Integer n){
        BigInteger fat = BigInteger.ONE;

        for(Integer i = 1; i <= n; i++){
            // fat = fat * i;
            fat = fat.multiply(BigInteger.valueOf(i));
        }

        return fat;

    }



    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        Integer n = scan.nextInt();
        scan.close();

        BigInteger resultado = bigFatorial(n);


        System.out.println("Valor fatorial do numero: " + resultado);


    }

}
