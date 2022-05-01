package vuclip;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Driver class to write older version apps to output file
 *
 */
public class Driver {

    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.out.println("Usage : [input file path][output path][delimiter]");
            return;
        }
        String filePath = args[0];
        String outputPath = args[1];
        String delimiter = args.length < 3 ? "," : args[2];
        InputParser inputParser = new InputParser();

        Supplier<Stream<ApiVersionEntity>> apiVersionEntityStream = () -> inputParser.parseInput(filePath, delimiter);

        AppVersionService appVersionService = new AppVersionService();

        Set<String> olderApiVersionApps = appVersionService.getOlderApiVersionApps(apiVersionEntityStream);

        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(outputPath)))) {
            olderApiVersionApps.forEach(app -> writer.println(app));
        }
    }
}
