import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("emails.txt");

        Files.lines(path)
                .filter(x -> !x.startsWith("Spam"))
                .forEach(x -> System.out.println(x));

    }
}
