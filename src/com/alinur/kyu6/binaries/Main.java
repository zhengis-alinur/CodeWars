package com.alinur.kyu6.binaries;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(Main.decode(Main.code("10500")));
    }

    public static String code(String strng) {
        StringBuilder result = new StringBuilder();
        int[] nums = new int[strng.length()];
        char[] chars = strng.toCharArray();
        for (int i = 0; i < strng.length(); i++) {
            nums[i] = Integer.parseInt(String.valueOf(chars[i]));
            result.append(convertToBinary(nums[i]));
        }
        return String.valueOf(result);
    }

    public static String convertToBinary(int num){
        //poin a) counting the number of digits
        int[] binary = new int[40];
        StringBuilder sb = new StringBuilder();
        int numOfDigits;
        if(num == 0)
            return "10";
        else
            numOfDigits = (int) Math.floor(Math.log(num)/Math.log(2));
        //point b) write k-1 times the digit 0 followed by the digit 1
        sb.append("0".repeat(numOfDigits)).append(1);

        //point c) Write digit d as a binary string, with the rightmost bit being the least significant
        int index = 0;
        while(num > 0){
            binary[index++] = num%2;
            num = num/2;
        }
        // point d)  concat the result of b) and c) to get the coding of d
        for(int i = index-1;i >= 0;i--){
            sb.append(binary[i]);
        }

        return String.valueOf(sb);
    }

    public static String decode(String str) {
        char[] bits = str.toCharArray();
        ArrayList<String> nums = new ArrayList<>();
        int temp = 1;
        int i = 0;
        while(i < str.length()) {
            if(bits[i] == '1') {
                nums.add(str.substring(i + 1, i + temp + 1));
                if(i + temp + 1 > str.length())
                    break;
                else
                    i += temp + 1;
                temp = 1;
            }else {
                i++;
                temp++;
            }
        }
        ListIterator<String> iterator = nums.listIterator();
        while (iterator.hasNext()) {
            iterator.set(String.valueOf(Integer.parseInt(iterator.next(),2)));
        }
        return String.join("", nums);
    }

}
