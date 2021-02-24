package com.alinur.kyu5.numberOfZerosNfactorial;
public class Main {
    public static void main(String[] args) {
        System.out.println(Main.zeros(15));
    }
    public static int zeros(int n) {
        int res = 0;
        int kMax = (int) Math.floor(Math.log(n) / Math.log(5));
        System.out.println("kMax = " + kMax);
        double x;
        for(int k = 1; k <= kMax; k++) {
            x = Math.floor(n/Math.pow(5, k));
            System.out.println(x);
            res += x;
        }
        return res;
    }
}
