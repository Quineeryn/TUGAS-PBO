package sdysdy;							         // package merupakan cara untuk mengelompokkan kelas kelas
										         //	yang saling terkait.

public class sdysdy {   				         // public class digunakan untuk mendefinisikan kelas.
	public static void main(String[] args) {
		byte angka1 = 125;
		byte angka2 = 6;
		byte hasil = (byte) (angka1 + angka2);   // Terjadi casting dari hasil operasi yang bertipe int ke byte.
		
		System.out.println("Hasil 1 " +hasil); 	 // Print hasil operasi.
	}
}

// CATATAN
// Tipe data byte hanya dapat menampung nilai angka dari range -128 sampai 127.
// Hasil default operasi bertipe data byte adalah integer.
// Karena hasil operasi lebih dari range tipe data byte, maka dilakukan wrapping.
// Wrapping adalah di mana sebuah tipe data numerik yang lebih besar diubah menjadi tipe data yang lebih kecil 
// dan nilai yang melewati batas tipe data yang lebih kecil tersebut "dililitkan" kembali ke dalam rentang validnya.