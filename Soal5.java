package minggu_2;
import java.util.Scanner;	//import library sehingga user bisa melakukan input

/**
*@author Canandra
*@version 1.0
@since 2023-09-02
*/

public class Soal5 {
	public static void main(String args[]) {		
		Scanner input = new Scanner(System.in);		//membuat objek Scanner untuk membaca input dari pengguna
		System.out.print("Masukkan string 1 : ");	
		String mystring1 = input.next();			//meminta pengguna untuk memasukkan string pertama
		System.out.print("Masukkan string 2 : ");
		String mystring2 = input.next();			//meminta pengguna untuk memasukkan string kedua
		input.close();								//menutup objek Scanner setelah selesai digunakan
		
		int sum = mystring1.length() + mystring2.length(); //menghitung jumlah karakter dalam kedua string dan mencetaknya
		System.out.println(sum);
		
		int hasil = mystring1.compareTo(mystring2);		//membandingkan kedua string secara leksikografis
		
		if(hasil > 0) {
			System.out.println("Apakah " + mystring2 + " lebih besar secara leksikografis dari " + mystring1+"?" +" NO");
			
		}else if(hasil < 0) {
			System.out.println("Apakah " + mystring2 + " lebih besar secara leksikografis dari " + mystring1+"?" +" YES");
			
		}else {
			System.out.println("Keduanya setara");
		}
		
		//mengubah huruf pertama menjadi huruf kapital jika string tidak kosong dan mencetaknya
		if(!mystring1.isEmpty()) {
			String output1 = mystring1.substring(0,1).toUpperCase() + mystring1.substring(1);
			System.out.print(output1+" ");
		}
		if(!mystring2.isEmpty()) {
			String output2 = mystring2.substring(0,1).toUpperCase() + mystring2.substring(1);
			System.out.println(output2);
		}
		
	}
}
		
