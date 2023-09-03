package minggu_2;

/**
*@author Canandra
*@version 1.0
@since 2023-09-02
*/

public class Soal2 {

		public static void main(String[] args) { 
		final double CM_PER_INCH = 2.54; 					//deklarasi konstanta (nilai tetap)
		double paperWidth = 8.5; 							//deklarasi var. bertipe double
		double paperHeight = 11; 
		System.out.println("Paper size in centimeters: " +  //printout hasil
		paperWidth * CM_PER_INCH + " by " + paperHeight * 
		CM_PER_INCH); 
	} 
}

