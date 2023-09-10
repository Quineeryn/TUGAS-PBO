package minggu_3;
import java.util.Scanner;

public class Soal4w3 {
	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Gaji pokok agent
	        double gajiPokok = 500000.0;

	        // Harga setiap item
	        double hargaItem = 50000.0;

	        // Meminta jumlah item yang berhasil dijual
	        System.out.print("Masukkan jumlah item yang berhasil dijual: ");
	        int jumlahItemTerjual = input.nextInt();
	        input.close();
	        
	        double totalBonus = 0.0;

	        // Menghitung bonus penjualan
	        if (jumlahItemTerjual >= 40 && jumlahItemTerjual <= 80) {
	            // Bonus 25% dari total penjualan
	            totalBonus = 0.25 * jumlahItemTerjual * hargaItem;
	        } else if (jumlahItemTerjual > 80) {
	            // Bonus 35% dari total penjualan
	            totalBonus = 0.35 * jumlahItemTerjual * hargaItem;
	        } else if (jumlahItemTerjual < 15) {
	            // Denda pemotongan gaji pokok sebesar 15% dari kurangnya item
	            double kurangItem = 15 - jumlahItemTerjual;
	            totalBonus = -0.15 * kurangItem * hargaItem;
	        } else {
	            // Bonus 10% setiap item
	            totalBonus = 0.10 * jumlahItemTerjual * hargaItem;
	        }

	        // Menghitung total pendapatan agent
	        double totalPendapatan = gajiPokok + totalBonus;

	        // Menampilkan total pendapatan agent
	        System.out.println("Total pendapatan agent adalah: Rp " + totalPendapatan);
	    }
	}
