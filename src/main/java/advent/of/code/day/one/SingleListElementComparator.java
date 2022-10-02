package advent.of.code.day.one;

import java.util.List;

public class SingleListElementComparator implements ListElementComparator {

    @Override
    public int compare(Integer[] intList) {
        if (intList.length <= 1 ) {
            return 0;
        }

        int numberOfDepthIncreases = 0;
        for (int index=0; index< intList.length; index++) {
            int firstElement = intList[index];
            int secondElement = intList[index +1];

            if (firstElement < secondElement) {
                numberOfDepthIncreases++;
            }
        }

        System.out.println("Number of depth increases: " + numberOfDepthIncreases);
        return numberOfDepthIncreases;
    }
}
