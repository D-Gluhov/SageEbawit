package Serialiazed;

import java.io.*;
import java.util.Arrays;

public class ReadFile {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Animal.bin"))){
//            FileInputStream fis = new FileInputStream("Animal.bin");
//            ObjectInputStream ois = new ObjectInputStream(fis);

            Animal[] animals = (Animal[]) ois.readObject();
            System.out.println(Arrays.toString(animals));

//            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
