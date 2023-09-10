package minggu_3;

import java.util.Scanner;

public class Soal5w3 {
	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Membaca plat nomor untuk 4 mobil
	        System.out.println("Masukkan plat nomor untuk 4 mobil (misal: 1234 5678 9012 3456):");
	        String platMobil1 = input.next();
	        String platMobil2 = input.next();
	        String platMobil3 = input.next();
	        String platMobil4 = input.next();

	        input.close();
	        
	        // Menggabungkan angka dari plat nomor 4 mobil
	        String gabunganPlat = platMobil1 + platMobil2 + platMobil3 + platMobil4;

	        // Mengubah gabungan plat menjadi angka
	        long angkaPlat = Long.parseLong(gabunganPlat);

	        // Memeriksa aturan buka tutup jalan
	        if ((angkaPlat - 999999) % 5 != 0) {
	            System.out.println("Berhenti");
	        } else {
	            System.out.println("Jalan");
	        }
	    }
}

