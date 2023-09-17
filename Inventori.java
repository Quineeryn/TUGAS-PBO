package minggu4plus;

public class Inventori {
    Barang[] barangs; // Array untuk menyimpan objek Barang

    // Metode untuk menginisialisasi objek-objek Barang dalam array barangs
    void initBarang() {
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10); 
        barangs[1] = new Barang("002", "Celana", 10);
    }
    
    // Metode untuk menampilkan informasi tentang barang-barang dalam inventori
    void showBarang() {
        System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok() + ")"); 
        System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStok() + ")");
    }
    
    // Metode untuk melakukan pengadaan barang
    void pengadaan() {
        initBarang(); // Menginisialisasi barang-barang awal
        barangs[0].setStok(1); // Menambah stok barang pertama sebanyak 1
        barangs[0].setStok(-1); // Mencoba mengurangkan stok barang pertama sebanyak 1 (tidak berhasil karena validasi)
        barangs[0].setStok(1); // Menambah stok barang pertama sebanyak 1 lagi
        showBarang(); // Menampilkan informasi stok barang setelah pengadaan
    }
    
    public static void main(String[] args) { 
        Inventori beli = new Inventori(); 
        beli.pengadaan(); // Memanggil metode pengadaan untuk mengelola stok barang
    }
}
