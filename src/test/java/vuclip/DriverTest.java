package vuclip;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class DriverTest {

    @Test(expected = IllegalArgumentException.class)
    public void inputWithWrongFilePath() throws IOException {
        String[] args = {"src/main/java/vuclip/xyz.txt",
                "out/output.txt", ","};
        Driver.main(args);
    }

    @Test
    public void inputWithDelimiter() throws IOException {
        String[] args = {"src/main/java/vuclip/input.txt",
                "out/output.txt", ","};
        Driver.main(args);

        String outputPath = "out/output.txt";
        List<String> actual = Files.lines(Paths.get(outputPath)).collect(Collectors.toList());
        assertThat(actual, Matchers.contains("Mail App","Video Call App"));
    }

    @Test
    public void inputWithoutDelimiter() throws IOException {
        String[] args = {"src/main/java/vuclip/input.txt",
                "out/output.txt"};
        Driver.main(args);

        String outputPath = "out/output.txt";
        List<String> actual = Files.lines(Paths.get(outputPath)).collect(Collectors.toList());
        assertThat(actual, Matchers.contains("Mail App","Video Call App"));
    }
}