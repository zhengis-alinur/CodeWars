package com.alinur.kyu6.TortoiseRacing;

public class Main {
//
    public static void main(String[] args) {
        Main.race(720, 850, 70);
    }


    public static int[] race(int v1, int v2, int g) {
        if(v2 < v1) {
            return null;
        }
        double timeInSeconds = ((double)g / (v2-v1))*3600;
        double hour = timeInSeconds / 3600;
        timeInSeconds %= 3600;
        double min = timeInSeconds / 60;
        timeInSeconds %= 60;
        double sec = timeInSeconds;
        int[] res = new int[3];
        res[0] = (int) hour;
        res[1] = (int) min;
        res[2] = (int) sec;
        return res;
    }
}
