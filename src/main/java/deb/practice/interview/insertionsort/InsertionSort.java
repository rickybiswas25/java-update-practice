package deb.practice.interview.insertionsort;

/**
 * Created by Deb
 * Date : 1/12/2023
 */
public class InsertionSort {

    public int[] sort(int[] array) {
        for (int i = 1; i <= array.length - 1; i++) {
            int newElement = array[i];
            int j;
            for (j = i; j > 0 && array[j - 1] > newElement; j--) {
                array[j] = array[j - 1];
            }
            array[j] = newElement;
        }
        return array;
    }

}
