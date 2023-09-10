package minggu_3;
import java.math.BigInteger;
import java.util.Scanner;


public class Soal6w3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca dua bilangan sebagai string
        System.out.print("Masukkan a :");
        String aStr = scanner.nextLine();
        System.out.print("Masukkan b :");
        String bStr = scanner.nextLine();
        
        // Mengonversi string menjadi BigInteger
        BigInteger a = new BigInteger(aStr);
        BigInteger b = new BigInteger(bStr);
        
        // Menambahkan a dan b
        BigInteger sum = a.add(b);
        
        // Mengalikan a dan b
        BigInteger product = a.multiply(b);
        
        // Menampilkan hasil tanpa leading zeros
        System.out.println(sum.toString());
        System.out.println(product.toString());
        
        scanner.close();
    }
}
