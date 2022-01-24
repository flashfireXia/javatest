package org.example;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.io.*;

public class Practice {
    public static void main(String[] args) throws FileNotFoundException {
        int x = 77;
//        System.out.println(getYueshu(x));
        Scanner input = new Scanner(new File("C:\\Users\\wy\\Desktop\\t.txt"));
        int count = 0;
        while (input.hasNext()) {
            String w = input.next();
            count++;
        }
        System.out.println(count);
    }

    public static int getYueshu(int x){
        int s = 2;
        while (x % s != 0){
            s++;
        }
        return s;
    }
}
