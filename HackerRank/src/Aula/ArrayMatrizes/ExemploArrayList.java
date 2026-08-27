package Aula.ArrayMatrizes;

import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        // int [] valores = new int [5];

        // Integer [] valores = new Integer[5];

        ArrayList<Integer> valores = new ArrayList<>();
        valores.add(10);
        valores.add(20);
        valores.add(30);

        int valor = valores.get(valores.size()-1);


        System.out.println(valores.size());

        for (Integer v : valores){
            System.out.println(v);
        }

    }

}
