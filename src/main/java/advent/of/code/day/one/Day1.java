package advent.of.code.day.one;

import lombok.AllArgsConstructor;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
public class Day1 {
    private static final String DAY_ONE_FILENAME = "day_1.txt";

    ResourceFileReader fileReader;

    public int run() throws IOException {
        String read = fileReader.read(DAY_ONE_FILENAME);

        List<Integer> split = Arrays.stream(read.split("\n"))
                .map(Integer::parseInt)
                .toList();

        int before = 1000000000;
        int numberOfDepthIncreases = 0;
        for (int next: split) {
            if(before < next) {
                numberOfDepthIncreases++;
            }
            before = next;
        }

        System.out.println("Number of depth increases: " + numberOfDepthIncreases);
        return numberOfDepthIncreases;
    }



}
