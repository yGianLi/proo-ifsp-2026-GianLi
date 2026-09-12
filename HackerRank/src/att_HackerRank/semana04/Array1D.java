package att_HackerRank.semana04;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Array1D {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int[] myArray = new int[n];

        for (int i = 0; i < n; i++) {
            myArray[i] = Integer.parseInt(bufferedReader.readLine().trim());
        }

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }


        bufferedReader.close();
    }


}
