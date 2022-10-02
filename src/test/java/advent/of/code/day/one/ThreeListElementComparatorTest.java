package advent.of.code.day.one;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ThreeListElementComparatorTest {

    private final ListElementComparator comparator = new ThreeListElementComparator();

    @Test
    void worksCorrectly() {
        Integer[] integers = {1, 2, 3, 1, 2, 4, 1, 2, 5};
        int compare = comparator.compare(integers);

        assertThat(compare).isEqualTo(2);
    }

    @Test
    void minusOneNumber() {
        Integer[] integers = {1, 2, 3, 1, 2, 4, 1, 2};
        int compare = comparator.compare(integers);

        assertThat(compare).isEqualTo(1);
    }

    @Test
    void minusTwoNumbers() {
        Integer[] integers = {1, 2, 3, 1, 2, 4, 1};
        int compare = comparator.compare(integers);

        assertThat(compare).isEqualTo(1);
    }

    @Test
    void UpsAndDowns() {
        Integer[] integers = {1, 2, 3, 1, 2, 4, 1, 1, 1, 2, 2, 2, 3, 3, 3};
        int compare = comparator.compare(integers);

        assertThat(compare).isEqualTo(3);
    }

}