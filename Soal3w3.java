package minggu_3;
import java.util.Scanner;

public class Soal3w3 {
	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Membaca input dari pengguna
	        System.out.print("Masukkan A operator B: ");
	        int A = input.nextInt();	// Input variabel A
	        char operator = input.next().charAt(0);	// Membaca operator
	        int B = input.nextInt();	// Input variabel B
	        int hasil=0;
	        input.close();
	        
	        // Cek batasan
	        if (A < 1 || A > 1000 || B < 1 || B > 1000) {
	            System.out.println("A dan B harus berada dalam rentang 1 hingga 1000.");
	        } else if (operator == '/' && A % B != 0) {
	            System.out.println("Jika operator adalah '/', A harus habis dibagi B.");
	        } else {
	            // Melakukan perhitungan sesuai dengan operator
	            if (operator == '+') {
	                hasil = A + B;
	            } else if (operator == '-') {
	                hasil = A - B;
	            } else if (operator == '*') {
	                hasil = A * B;
	            } else if (operator == '/') {
	                hasil = A / B;
	            } else if (operator == '%') {
	                hasil = A % B;
	            }
	            // Print hasil perhitungan
	            System.out.println("Hasil A " + operator + " B adalah: " + hasil);
	        }
	    }
	}