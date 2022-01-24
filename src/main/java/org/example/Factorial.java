package org.example;

public class Factorial {
    public static void main(String[] args){
        System.out.println(mici2(10, 3));
    }

    public static long mici1(int x, int n) {
        long r = 1L;
        for (long i = 1; i <= n; i++){
            r = x * r;
        }
        return r;
    }

    public static long mici2(int x, int n){
        if (n == 0){
            return 1;
        }
        return mici2(x, n-1) * x;
    }
}
