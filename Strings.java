package package3;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strList;
		int size;

		Scanner scan = new Scanner(System.in);

		System.out.println("\nHow many strings do want to sort?? ");
		size = scan.nextInt();
		strList = new String[size];

		System.out.println("\nEnter the string...");
		for (int i = 0; i < size; i++) {
			strList[i] = scan.next();
		}

		scan.close();

		Sorting.insertionSortDescending(strList);
		System.out.println("\nYour string in sorted oerder...");
		for (int i = 0; i < size; i++) {
			System.out.println(strList[i] + " ");
		}
		System.out.println();
	}

}