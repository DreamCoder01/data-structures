package org.coreconcepts;

import java.util.Arrays;

public class Arrays2D {
    public static void main(String[] args) {

        //Instantiation
        int[][] int2DArray = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.deepToString(int2DArray));

        char[][] char2DArray = new char[][] {
                new char[] {'X', '-', '-'},
                new char[] {'Y', '-', '-'},
                new char[] {'Z', '-', '-'}
        };
        System.out.println(Arrays.deepToString(char2DArray));

        //Iterating through 2D Arrays
        char[][] char2DArrayTwo = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char2DArrayTwo[i][j] = '-';
            }
        }
        System.out.println(Arrays.deepToString(char2DArrayTwo));

        //Assigning values to instantiated 2D Arrays
        char2DArrayTwo[0][0] = 'X';
        char2DArrayTwo[1][0] = 'Y';
        char2DArrayTwo[2][0] = 'Z';
        System.out.println(Arrays.deepToString(char2DArrayTwo));
    }
}
