package app;

import java.util.Scanner;

public class CacheInteger {
    public static void main(String[] args){
        Integer x1 = 100;
        Integer x2 = 100;
        System.out.println("Par dentro da faixa (==): " + (x1 == x2));
        System.out.println("Par dentro da faixa (.equals()) " + x1.equals(x2));

        Integer y1 = 200;
        Integer y2 = 200;

        System.out.println("Par fora da faixa (== ): " + (y1 == y2));
        System.out.println("Par fora da faixa (.equals()): " + y1.equals(y2));
        }
}



