package minggu_3;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Soal1w3 {
	
	 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 System.out.print("Masukkan string :");
	 String input = scanner.nextLine();

	 String regex = "[A-Za-z]+"; // Mendefinisikan pola ekspresi reguler untuk menmukan token
	 Pattern pattern = Pattern.compile(regex); // Membuat objek pola regex
	 Matcher matcher = pattern.matcher(input); // Mencocokkan pola dengan input

     int tokenCount = 0;

     while (matcher.find()) { // Validasi selama ada kecocokan pola dalam input
	     String token = matcher.group(); // Mendapatkan token yang cocok dengan pola
	     tokenCount++;
	 }
     System.out.println(tokenCount);
	        
	 matcher.reset(); // Mengatur ulang matcher agar mencari token lagi dari awal

	 while (matcher.find()) {
		 String token = matcher.group();
	     System.out.println(token);
	 }
      scanner.close();	// Menutup objek scanner
	 }
}

