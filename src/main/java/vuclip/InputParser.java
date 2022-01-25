package vuclip;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 *  Parses input file to stream of ApiVersionEntity
 */
public class InputParser {
    /**
     * Parse input file with given delimiter
     * @param filePath
     * @param delimiter
     * @return Stream<ApiVersionEntity>
     */
    public Stream<ApiVersionEntity> parseInput(String filePath, String delimiter){
        Stream<String> lines;
        try {
            lines = Files.lines(Paths.get(filePath));
        } catch (IOException e) {
            throw new IllegalArgumentException("Input path is not valid",e);
        }
        return lines.map(l -> parseLine(l, delimiter));
    }

    /**
     * Input line to ApiVersionEntity Converter
     * @param line
     * @param delimiter
     * @return ApiVersionEntity
     */
    private ApiVersionEntity parseLine(String line, String delimiter) {
        String[] split = line.split(delimiter);
        return new ApiVersionEntity(split[0], split[1], split[2]);
    }
}
