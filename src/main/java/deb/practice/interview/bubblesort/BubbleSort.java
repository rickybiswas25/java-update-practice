package deb.practice.interview.bubblesort;

/**
 * Created by Deb
 * Date : 1/12/2023
 */
public class BubbleSort {

    public int[] sort(int[] array) {
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = i + 1; j <= array.length - 1; j++) {
                swapIfNeeded(array, i, j);
            }
        }
        return array;
    }

    private void swapIfNeeded(int[] array, int i, int j) {
        if (array[i] > array[j]) {
            int temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }
    }

}
