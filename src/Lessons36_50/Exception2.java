package Lessons36_50;

import java.io.IOException;
import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) throws ExceptionScanner {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scan.nextLine());
            if (x != 10) {
                    throw new ExceptionScanner("Vvel ne 10");

            }
        }
    }
}
