package com.alinur.kyu4.determinant;

import java.util.Arrays;

public class Main {
    public static int sum = 0;
    public static void main(String[] args) {
        int[][] matrix = new int[][] {{1,3,4,5}, {2,3,10,5}, {4,4,1,6}, {8,6,33,45}};
        System.out.println(Main.determinant(matrix));
    }

    public static int determinant(int[][] matrix) {
        int det = 0;
        if(matrix.length == 2) {
            det = matrix[0][0]*matrix[1][1]-matrix[1][0]*matrix[0][1];
            return det;
        }
        int [][] subMatrix = new int[matrix.length-1][matrix.length-1];
        for(int k = 0; k < matrix.length; k++) {
            int j = 0;
            for(int i = 0; i < matrix.length; i++){
                if (k != i) {
                    subMatrix[j++] = Arrays.copyOfRange(matrix[i], 1, matrix.length);
                }
            }
            det = det + (int) Math.pow(-1, k)*determinant(subMatrix)*matrix[k][0];
            sum = sum + det;
        }
        return det;
    }
}
