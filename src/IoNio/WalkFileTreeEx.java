package IoNio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;

public class WalkFileTreeEx {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("C:\\Users\\Danil\\OneDrive\\Рабочий стол\\FFFF");
        Path destination = Paths.get("C:\\Users\\Danil\\OneDrive\\Рабочий стол\\Copy");

        Files.walkFileTree(source, new MyClassFileResult(source, destination));
    }
}

class MyClassFileResult extends SimpleFileVisitor<Path> {
    Path source;
    Path destination;

    public MyClassFileResult(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }

    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
            throws IOException {
        Path newDestination = destination.resolve(source.relativize(dir));
        Files.copy(dir, newDestination, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }


    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
            throws IOException {
        Path newDestination = destination.resolve(source.relativize(file));
        Files.copy(file, newDestination, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }
}