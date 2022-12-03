package Lessons36_50;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        try {
            readingFile();
        } catch (FileNotFoundException v) {
            System.out.println("File ne naiden");
        }
    }

    public static void readingFile() throws FileNotFoundException {
        File file = new File("dsfsdf");
        Scanner scan = new Scanner(file);
    }
}