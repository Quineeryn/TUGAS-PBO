package minggu_2;					//deklarasi package
import java.util.Scanner;			//import class Scanner dari paket java.util

/**
*@author Canandra
*@version 1.0
@since 2023-09-02
*/

public class Soal1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan sebuah angka :");
		
		if(input.hasNextLong()) {		//validasi inputan yang dimasukkan user bertipe data long
		long num = input.nextLong();
		cekangka(num);					//method cek angka untuk mengidentifikasi angka ada di range tipe data apa
		input.close();					//menutup Scanner untuk menghindari memory leak
		//*	
		}else {
			System.out.println("N tidak muat di mana pun");
		}
	}
	
	public static void cekangka(long num) {
		java.util.ArrayList<String> tipeData = new java.util.ArrayList<>();		//inisialisasi arraylist untuk menyimpan tipe data yang sesuai
		
		if(num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE) {		//pemeriksaan apakah memenuhi kriteria byte
			tipeData.add("byte");
		}
		
		if(num >= Short.MIN_VALUE && num <= Short.MAX_VALUE) {		//pemeriksaan apakah memenuhi kriteria short
			tipeData.add("short");
		}
		
		if(num>= Integer.MIN_VALUE && num <= Integer.MAX_VALUE) {	//pemeriksaan apakah memenuhi kriteria int
			tipeData.add("int");
		}
		
		if(num >= Long.MIN_VALUE && num <= Long.MAX_VALUE ) {		//pemeriksaan apakah memenuhi kriteria long
			tipeData.add("long");
		}
		
		if (!tipeData.isEmpty()) {
            for (String tipeDatas : tipeData) {
                System.out.println("N bisa muat di : " + tipeDatas);	//loop for each untuk mengulangi setiap elemen dalam arraylist tipeData
            }
		}else {
			System.out.println("N tidak muat di mana pun");
		}
	}
}


