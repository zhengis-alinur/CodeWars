package com.alinur.kyu7.Testing123;
import java.util.*;

public class Main {
    //
    public static void main(String[] args) {
        String[] arr = {"sdf", "sdf", "fgsr", "sdgsd"};
        List<String> arrAsList = Arrays.asList(arr);
        List<String> result = Main.number(arrAsList);
        result.forEach(System.out::println);
    }

    public static List<String> number(List<String> lines) {
        for(int i=0; i<lines.size(); i++){
            lines.set(i, i+1 + ": " + lines.get(i));
        }
        return lines;
    }
}
