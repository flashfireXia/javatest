package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;

public class Practice3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in1 = new Scanner(new File("C:\\Users\\wy\\Desktop\\a.txt"));
        Scanner in2 = new Scanner(new File("C:\\Users\\wy\\Desktop\\b.txt"));


        ArrayList<String> list1 = getWords(in1);
        ArrayList<String> list2 = getWords(in2);

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(getOverlap(list1, list2));

        HashSet<String> set1 = new HashSet<>(list1);
    }

    public static ArrayList<String> getWords(Scanner input){
        input.useDelimiter("[^a-zA-Z']+");
        ArrayList<String> words = new ArrayList<>();
        while (input.hasNext()){
            String next = input.next().toLowerCase(Locale.ROOT);
            words.add(next);
        }
        Collections.sort(words);

        ArrayList<String> result = new ArrayList<>();
        if (words.size() > 0){
            result.add(words.get(0));
            for (int i = 1; i < words.size(); i++){
                if (!words.get(i).equals(words.get(i-1))){
                    result.add(words.get(i));
                }
            }
        }

        return result;
    }

    public static ArrayList<String> getOverlap(ArrayList<String> list1, ArrayList<String> list2){
        ArrayList<String> result = new ArrayList<>();
        int i1 = 0;
        int i2 = 0;
        while (i1 < list1.size() && i2 < list2.size()){
            int num = list1.get(i1).compareTo(list2.get(i2));
            if (num == 0){
                result.add(list1.get(i1));
                i1 += 1;
                i2 += 1;
            }
            else if (num < 0){
                i1 += 1;
            }
            else {
                i2 += 1;
            }
        }
        return result;
    }
}
