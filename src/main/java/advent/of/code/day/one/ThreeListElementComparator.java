package advent.of.code.day.one;

public class ThreeListElementComparator implements ListElementComparator {

    @Override
    public int compare(Integer[] intList) {
        if (intList.length <= 1) {
            return 0;
        }

        int numberOfDepthIncreases = 0;

        for (int index = 3; index < intList.length; index++) {
            Window firstWindow = new Window(intList[index-3], intList[index-2], intList[index-1]);
            Window secondWindow = new Window(intList[index], intList[index-1], intList[index-2]);

            if (firstWindow.sum() < secondWindow.sum()) {
                numberOfDepthIncreases++;
                System.out.println(numberOfDepthIncreases);
            }
        }

        System.out.println("Number of depth increases: " + numberOfDepthIncreases);
        return numberOfDepthIncreases;
    }

}
