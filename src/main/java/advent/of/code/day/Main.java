package advent.of.code.day;

import advent.of.code.day.one.Day1;
import advent.of.code.day.one.ResourceFileReader;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ResourceFileReader resourceFileReader = new ResourceFileReader();
        Day1 day1 = new Day1(resourceFileReader);

        day1.run();
    }
}
