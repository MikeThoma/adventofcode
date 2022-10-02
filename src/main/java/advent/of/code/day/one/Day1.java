package advent.of.code.day.one;

import lombok.AllArgsConstructor;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
public class Day1 {
    private static final String DAY_ONE_FILENAME = "day_1.txt";

    private final ResourceFileReader fileReader;
    private final ListElementComparator comparator;

    public int run() throws IOException {
        String read = fileReader.read(DAY_ONE_FILENAME);

        Integer[] split = Arrays.stream(read.split("\n"))
                .map(Integer::parseInt)
                .toList()
                .toArray(new Integer[0]);

        return comparator.compare(split);
    }


}
