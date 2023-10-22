package package3;

import java.lang.Comparable;

public class Sorting {
    public static <T extends Comparable<T>> void selectionSort(T[] list) {
        int min;
        T temp;

        for (int index = 0; index < list.length - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < list.length; scan++) {
                if (list[scan].compareTo(list[min]) < 0) {
                    min = scan;
                }
            }

            // Swap the values.
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }

    public static <T extends Comparable<T>> void insertionSortDescending(T[] list) {
        for (int index = 1; index < list.length; index++) {
            T key = list[index];
            int position = index;

            while (position > 0 && key.compareTo(list[position - 1]) > 0) {
                list[position] = list[position - 1];
                position--;
            }
            list[position] = key;
        }
    }
}
