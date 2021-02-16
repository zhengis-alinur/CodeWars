package com.alinur.kyu6.StopgninnipSMysdroW;

public class Main {
//
    public static void main(String[] args) {
        Main.spinWords("my name is Alinur");
    }

    //this solution could not go through all tests!

    public static String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        for(int i = 0; i < words.length; i++) {
            if(words[i].length() > 4) {
                words[i] = new StringBuffer(words[i]).reverse().toString();
            }
        }
        System.out.println(String.join(" ", words));
        return String.join(" ", words);
    }



}
