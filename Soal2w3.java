package minggu_3;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Soal2w3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputStrings = new ArrayList<>();  // Membuat arraylist untuk menyimpan string
        List<Integer> inputIntegers = new ArrayList<>(); // Membuat arraylist untuk menyimpan integer

        System.out.println("Masukkan string dan integer (ketik 'exit' untuk keluar):");

        while (true) {
            System.out.print("String: ");
            String inputString = scanner.next();

            if (inputString.equalsIgnoreCase("exit")) { // Cek apakah user ingin exit
                break;
            }

            System.out.print("Integer: ");
            int inputInt = scanner.nextInt();

            inputStrings.add(inputString);	// Menyimpan string ke dalam arraylist
            inputIntegers.add(inputInt);	// Menyimpan integer ke dalam arraylist
        }

        System.out.println("================================");

        for (int i = 0; i < inputStrings.size(); i++) {
            String inputString = inputStrings.get(i);	// Mendapatkan value string ke dalam arraylist
            int inputInt = inputIntegers.get(i);		// Mendapatkan value integer ke dalam arraylist

            // Menggunakan printf untuk menformat output yang diinginkan
            System.out.printf("%-15s%03d%n", inputString, inputInt);
        }

        System.out.println("================================");

        scanner.close();
    }
}


