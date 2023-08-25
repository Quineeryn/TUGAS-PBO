package sdysdy;									//package merupakan cara untuk mengelompokkan kelas kelas
												//yang saling terkait.
															

public class ANALISIS2 {															// public class digunakan untuk mendefinisikan kelas.															
	public static void main(String[] args) {
		int i = 42;
		String s = (i<40)?"life":(i>50)?"universe":(i==42)?"ayam":"everything"; // 
		System.out.println(s);
	}
}