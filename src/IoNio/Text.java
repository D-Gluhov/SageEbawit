package IoNio;

import java.io.*;

public class Text {
    public static void main(String[] args) {
        String stix = """
                Ночевала тучка золотая
                На груди утеса-великана;
                Утром в путь она умчалась рано,
                По лазури весело играя;""";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("blanc2.txt"));
             BufferedReader reader = new BufferedReader(new FileReader("blanc1.txt"))) {
//            writer.write(stix);
//            System.out.println("Writer done!");

            String character;
            while ((character = reader.readLine()) != null) {
                writer.write(character);
                writer.write('\n');
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
