package Lessons36_50;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
//        String separator = File.separator;
//        String path = "C:" + separator + "Users" + separator + "Danil" + separator + "OneDrive" + separator +
//                "Рабочий стол" + separator + "Text.txt";
        File file = new File("Text2");
        Scanner scan = new Scanner(file);
        String line = scan.nextLine();
        String[] a1 = line.split(" ");
        int[] aInt1 = new int[7];
        int count = 0;
        for (String decimal : a1) {
            aInt1[count++] = Integer.parseInt(decimal);
        }
        System.out.println(Arrays.toString(aInt1));

//        while (scan.hasNextLine()) {
//            System.out.println(scan.nextLine());
//        }
        scan.close();
    }
}
