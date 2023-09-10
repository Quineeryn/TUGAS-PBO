package minggu_3;

public class Soal7w3 {
	
	 public static void main(String[] args){
	 
	 // Definisi dan inisialisasi array satu dimensi
	 int[] fisrtArray = {2, 5, 3}; 
	 int[] secondArray = {9, 5, 3}; 
	 int[] thirdArray = {2, 4, 9}; 
	 int[] fourthArray = {10, 11, 12}; 
	 int[] fifthArray = {13, 14, 15}; 
	 int[] sixthArray = {16, 17, 18}; 
	 int[] seventhArray = {19, 20, 21}; 
	 int[] eighthArray = {22, 23, 24}; 
	 int[] ninthArray = {25, 26, 27}; 
	 
	 // Definisi dan inisialisasi array dua dimensi dengan array satu dimensi
	 int[][] twoDimensionalArray1 = {fisrtArray, secondArray, 
	thirdArray}; 
	 int[][] twoDimensionalArray2 = {fourthArray, fifthArray, 
	sixthArray};
	 int[][] twoDimensionalArray3 = {seventhArray, eighthArray, 
	ninthArray};
	 
	 // Definisi dan inisialisasi array tiga dimensi dengan array dua dimensi
	 int[][][] threeDimensionalArray = {twoDimensionalArray1, twoDimensionalArray2, twoDimensionalArray3};
	 
	 
	// Cetak hasil
     for (int[][] twoDArray : threeDimensionalArray) {	// Iterasi melalui array tiga dimensi 
         System.out.print("{");
         for (int[] arr : twoDArray) {	// Iterasi melalui array dua dimensi dalam array tiga dimensi
             System.out.print("{");
             
             for (int i = 0; i < arr.length; i++) {
                 System.out.print(arr[i]);			// Mencetak elemen array saat ini
                 if (i < arr.length - 1) {			// Memeriksa apakah sudah mencapai elemen terakhir dari array
                     System.out.print(" ");
                 }
             }
             System.out.print("}");
             if (arr != twoDArray[twoDArray.length - 1]) {	// Memeriksa apakah telah mencapai elemen terakhir dari array
                 System.out.print(" ");
             }
         }
         System.out.println("}");
     	}
	 }
}

