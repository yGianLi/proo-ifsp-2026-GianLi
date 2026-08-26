package Aula.att_sala;

import java.util.Scanner;


public class beecrowd {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor 1: ");
        double valor1 = scan.nextDouble();
        System.out.print("Digite o valor 2: ");
        double valor2 = scan.nextDouble();
        System.out.print("Digite o valor 3: ");
        double valor3 = scan.nextDouble();


        if((valor1 + valor2) > valor3 && (valor1 + valor3) > valor2 && (valor2 + valor3) > valor1) {
            System.out.println("É um triângulo");
            double perimetro = valor1 + valor2 + valor3;
            System.out.print("Perimetro: " + perimetro);


        }else{
            System.out.println("Não é um triângulo");
            double trapezio = ((valor1 + valor2) * valor3)/2;

            System.out.println("Area: " + trapezio);
        }


    }

}
