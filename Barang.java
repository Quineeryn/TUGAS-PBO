package minggu4plus;

public class Barang {
    String kode_barang; // Atribut untuk menyimpan kode barang
    String nama_barang; // Atribut untuk menyimpan nama barang
    private int stok;   // Atribut untuk menyimpan stok barang (dienkapsulasi)

    // Konstruktor untuk inisialisasi objek Barang dengan kode, nama, dan stok awal
    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }

    // Metode getter untuk mengambil nilai stok
    public int getStok() {
        return stok;
    }

    // Metode untuk menambah stok barang dengan nilai tertentu
    public void addStok(int value) {
        this.stok += value;
    }

    // Metode untuk mengatur stok barang dengan nilai tertentu (dengan validasi)
    public void setStok(int stok) {
        if (stok > 0) {
            this.stok += stok;
        } else {
            System.out.println("Tambahan stok harus lebih dari 0.");
        }
    }
}
