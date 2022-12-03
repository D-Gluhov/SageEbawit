package Lessons;

import java.util.Scanner;

public class Switchs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number");
        int number = scan.nextInt();
        switch (number) {
            case 5 :
                System.out.println("U children");
                break;
            case 18 :
                System.out.println("U boy");
                break;
            case 35 :
                System.out.println("U man");
                break;
        }
    }
}
