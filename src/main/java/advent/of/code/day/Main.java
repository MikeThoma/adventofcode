package advent.of.code.day;

import advent.of.code.day.one.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ResourceFileReader resourceFileReader = new ResourceFileReader();
        ListElementComparator comparator = new ThreeListElementComparator();
        Day1 day1 = new Day1(resourceFileReader, comparator);

        day1.run();
    }
}
