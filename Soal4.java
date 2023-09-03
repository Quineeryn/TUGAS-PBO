package minggu_2;

/**
*@author Canandra
*@version 1.0
@since 2023-09-02
*/

public class Soal4 {					//method ini menerima parameter bertipe data long, lalu 
										//mengubahnya menjadi int
	static short methodOne(long l){				 
	int i = (int) l;							//mengubah nilai long menjadi int
	return (short)i;							//mengembalikan nilai int sebagai short
	}
	
	public static void main(String[] args){
	double d = 10.25;							//deklarasi variable d bertipe double
	float f = (float) d; 						//mengubah nilai double d menjadi float f
	byte b = (byte) methodOne((long) f); 		//memanggil methodOne dan casting ke tipedata byte
	System.out.println(b);
	}
}
