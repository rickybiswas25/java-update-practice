package deb.practice.interview.bubblesort;

import java.util.Arrays;

/**
 * Created by Deb
 * Date : 1/12/2023
 */
public class BubbleSort {

    public int[] sort(int[] array) {
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = i + 1; j <= array.length - 1; j++) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }
}
