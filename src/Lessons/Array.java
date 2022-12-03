package Lessons;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String [] str1 = {"Ya", " Idu ",  " po ", "Ulice"};
        for (int i = 0; i < str1.length; i++) {
            System.out.print(str1[i]);
        }
        System.out.println();
        int num = str1.length;
        for (int f = 0; f < num/2; f++) {
            String temp = str1[num - f - 1];
            str1[num - f - 1] = str1[f];
            str1[f] = temp;
        }
        for (int i = 0; i < str1.length; i++) {
            System.out.print(str1[i]);
        }
    /* int [] array = new int[5];
    for (int i = 0; i < array.length; i++){
        array [i] = 10;
        System.out.println(array[i]);
        }
        System.out.println();
    int [] array1 = new int [] {1, 7, 8,55, 5};
    for (int k: array1) {
        System.out.println(k);
        }*/
        /*int [][] array = new int[2][3];
        array [0][0] = 2;
        array [0][1] = 2;
        array [0][2] = 8;
        array [1][0] = 1;
        array [1][1] = 5;
        array [1][2] = 8;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }*/
    }
}
