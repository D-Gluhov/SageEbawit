package IoNio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class BufferChannalEx {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("blanc1.txt", "rw");
             FileChannel channel = file.getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(7);
            StringBuilder stix = new StringBuilder();

            int word = channel.read(buffer);

            while (word > 0) {
                buffer.flip();
                while (buffer.hasRemaining()) {
                    stix.append((char) buffer.get());
                }
                buffer.clear();
                word = channel.read(buffer);
            }
            System.out.println(stix);

            String s1 = "\nЗавтрашний день — это старый плут, который всегда сумеет вас провести. (С. Джонсон)";

            ByteBuffer buffer2 = ByteBuffer.wrap(s1.getBytes());
            channel.write(buffer2);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
