package app.att_hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EndOfFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();

            System.out.println(i + " " + linha);

            i++;
        }

        sc.close();
    }


}
