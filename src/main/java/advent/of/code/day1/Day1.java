package advent.of.code.day1;

import lombok.AllArgsConstructor;

import java.io.IOException;

@AllArgsConstructor
public class Day1 {
    private static final String DAY_ONE_FILENAME = "day_1.txt";

    ResourceFileReader fileReader;

    public int run() throws IOException {
        String read = fileReader.read(DAY_ONE_FILENAME);

        String[] split = read.split("\n");

        String before = "1000000000";
        int numberOfDepthIncreases = 0;
        for (String next: split) {
            int beforeInt = Integer.parseInt(before);
            int nextInt = Integer.parseInt(next);
            if(beforeInt < nextInt) {
                numberOfDepthIncreases++;
            }
            before = next;
        }
        return numberOfDepthIncreases;
    }



}
