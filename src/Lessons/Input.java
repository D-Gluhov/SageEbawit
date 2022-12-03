package Lessons;

import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        System.out.println("Please enter number");
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        int i = 0;
        int j = 0;
        while (i < p) {
           i++;
           j += i;
            }
        System.out.println(j);
        }
    }
