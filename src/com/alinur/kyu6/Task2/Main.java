package com.alinur.kyu6.Task2;

public class Main {
//
    public static void main(String[] args) {
        Main.solution(23);
    }

    //this solution could not go through all tests!

    public static long solution(int number) {
        int sum = 0;
        for(int i = 0; i < number; i++) {
            if((i % 3 == 0)||(i % 5 == 0)) {
                System.out.println(i);
                sum+=i;
            }
        }
        return sum;
    }
}
