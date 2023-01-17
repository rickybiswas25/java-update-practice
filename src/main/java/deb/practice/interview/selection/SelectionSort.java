package deb.practice.interview.selection;

import java.util.Arrays;

/**
 * Created by Deb
 * Date : 1/12/2023
 */
public class SelectionSort {

    public int[] sort(int[] array) {
        int currentIndex = 0;
        int largest = currentIndex;
        int unsortedIndex = array.length -1;
        do {

            for (int i = currentIndex; i <= unsortedIndex; i++) {
                if (array[largest] < array[i]) {
                     largest = i;
                }
            }
            int temp = array[largest];
            array[largest] = array[unsortedIndex];
            array[unsortedIndex] = temp;
            unsortedIndex--;
        } while (unsortedIndex >= 0);
        return array;
    }

}
