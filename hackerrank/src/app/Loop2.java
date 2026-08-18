package app;

import java.util.*;
import java.io.*;

public class Loop2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j = 1; j < n ; j++){
                int t1 = a + (j * b);
                t1 +
                System.out.println(a + " + " + j + " * " + b + " = " + t1);
            };
        }
        in.close();




    }
}