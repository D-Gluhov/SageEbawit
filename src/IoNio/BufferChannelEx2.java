package IoNio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class BufferChannelEx2 {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("Blanc.txt", "rw");
             FileChannel channel = file.getChannel()) {
//            String s = """
//                    Хочу тебя поздравить с днем рождения
//                    И очень много счастья пожелать!
//                    Пускай отличным станет настроение,
//                    Пусть будет все, о чем можно мечтать!
//
//                    От радости глаза пускай искрятся,
//                    Желаю света, солнца и добра,
//                    Как можно чаще ярко улыбаться,
//                    Чтоб стала жизнь прекрасней, чем вчера!""";
//            ByteBuffer buffer = ByteBuffer.wrap(s.getBytes());
//            channel.write(buffer);
            StringBuilder stix = new StringBuilder();
            ByteBuffer buffer = ByteBuffer.allocate(15);
            int line = channel.read(buffer);
            while (line > 0) {
                buffer.flip();
                while (buffer.hasRemaining()) {
                    stix.append((char) buffer.get());
                }
                buffer.clear();
                line = channel.read(buffer);
            }
            System.out.println(stix);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
