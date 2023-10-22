package package3;

import java.util.Scanner;

public class Numbers {

    // ----------------
    // Reads in an array of integers, sorts them,
    // then prints them in sorted order.
    // ----------------

    public static void main(String[] args) {

        Integer[] intList;
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.println("\nHow many integers do want to sort?? ");
        size = scan.nextInt();
        intList = new Integer[size];

        System.out.println("\nEnter the number...");

        for (int i = 0; i < size; i++) {
            intList[i] = scan.nextInt();
        }
        scan.close();

        Sorting.insertionSortDescending(intList);

        System.out.println("\nYour number in sorted order...");
        for (int i = 0; i < size; i++) {

            System.out.println(intList[i] + " ");
        }
        System.out.println();
    }
}
