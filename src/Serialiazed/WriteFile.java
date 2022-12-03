package Serialiazed;

import java.io.*;

public class WriteFile {
    public static void main(String[] args) {
        Animal[] animals = {new Animal("Bobik", 129),
                new Animal("Tuzik", 55), new Animal("Vas`ka", 75) };

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Animal.bin"))){
//            FileOutputStream fos = new FileOutputStream("Animal.bin");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(animals);

//            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}