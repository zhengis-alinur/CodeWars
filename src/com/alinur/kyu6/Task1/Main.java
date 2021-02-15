package com.alinur.kyu6.Task1;

public class Main {
//
    public static void main(String[] args) {
        Main.digPow(89,1);
    }

    //this solution could not go through all tests!

    public static long digPow(int n, int p) {
        int sum = 0;
        int digNum = 0;
        int d = n;
        while(( d / 10) > 1) {
            d = d / 10;
            digNum++;
        }

        int m = n;
        for(int i = digNum; i >= 0; i--){
            int x = (int) ( m / Math.pow(10, i));
            sum += Math.pow(x, p++);
            m = m % ((int)Math.pow(10, i)*x);
        }

        if((sum % n) == 0){
            System.out.println("Найдено " + sum/n);
            return sum/n;
        }
        else {
            System.out.println("Не найдено ");
            return -1;
        }
    }




}
