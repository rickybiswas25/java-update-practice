package bubblesort;

import deb.practice.interview.bubblesort.BubbleSort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Deb
 * Date : 1/12/2023
 */
public class BubbleSortUnitTest {
    private BubbleSort sorting;

    @BeforeEach
    void init() {
        this.sorting = new BubbleSort();

    }

    @Test
    void testBubbleSort() {
        int[] array = new int[]{5, 12, 55, 34, 65, -1, 23, 45};
        int[] resultedArray = new int[]{-1, 5, 12, 23, 34, 45, 55, 65};
        int[] sortedArray = this.sorting.sort(array);
        assertArrayEquals(resultedArray, sortedArray);
    }
}
