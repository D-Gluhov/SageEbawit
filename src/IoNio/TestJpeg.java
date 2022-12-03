package IoNio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestJpeg {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("C:\\Users\\Danil\\OneDrive\\Рабочий стол\\1070.jpg");
             FileOutputStream outputStream = new FileOutputStream("Medved.jpg")) {

            int digit;
            while ((digit = inputStream.read()) != -1) {
                outputStream.write(digit);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
