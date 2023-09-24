package minggu_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Produk> daftarMenu = new ArrayList<>();
        ArrayList<Penjualan> daftarPesanan = new ArrayList<>();

        // Menambahkan produk makanan ke daftar menu
        daftarMenu.add(new Produk("Nasi Goreng", 25000, 10));  // Mengatur stok awal
        daftarMenu.add(new Produk("Mie Ayam", 20000, 15));
        daftarMenu.add(new Produk("Sate Ayam", 30000, 20));

        boolean selesai = false;
        while (!selesai) {
            System.out.println("Daftar Menu Makanan:");
            for (int i = 0; i < daftarMenu.size(); i++) {
                Produk produk = daftarMenu.get(i);
                System.out.println((i + 1) + ". " + produk.getNamaProduk() + " - Rp " + produk.getHarga()
                        + " (Stok: " + produk.getStok() + ")");
            }

            System.out.print("Pilih nomor menu yang ingin dipesan (0 untuk selesai): ");
            int pilihan = input.nextInt();

            if (pilihan >= 1 && pilihan <= daftarMenu.size()) {
                Produk produkDipesan = daftarMenu.get(pilihan - 1);

                if (produkDipesan.getStok() > 0) {  // Pemeriksaan stok tersedia
                    System.out.print("Masukkan jumlah yang ingin dipesan: ");
                    int jumlah = input.nextInt();

                    if (jumlah <= produkDipesan.getStok()) {  // Pemeriksaan stok cukup
                        produkDipesan.tambahQty(jumlah);
                        int hargaTotalItem = produkDipesan.getHarga() * jumlah;
                        daftarPesanan.add(new Penjualan(produkDipesan.getNamaProduk(), jumlah, hargaTotalItem));

                        // Kurangi stok setelah pembelian
                        produkDipesan.kurangiStok(jumlah);

                        System.out.print("Item telah ditambahkan ke pesanan. Ingin memesan item lain? (ya/tidak): ");
                        String jawaban = input.next();
                        if (!jawaban.equalsIgnoreCase("ya")) {
                            selesai = true;
                        }
                    } else {
                        System.out.println("Stok tidak cukup. Stok tersedia: " + produkDipesan.getStok());
                    }
                } else {
                    System.out.println("Maaf, produk ini sudah habis. Silakan pilih yang lain.");
                }
            } else if (pilihan == 0) {
                selesai = true;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }

        // Tampilkan pesanan dan total bayar
        System.out.println("Pesanan Anda:");
      
        int totalBayar = 0;
        for (Penjualan pesanan : daftarPesanan) {
        	int hargaPerItem = pesanan.getHargaTotal() / pesanan.getQuantity();
            System.out.println(pesanan.getNamaProduk() + " - " + pesanan.getQuantity() + " x Rp " + hargaPerItem);
            totalBayar += pesanan.getHargaTotal();
        }
        System.out.println("Total Bayar: Rp " + totalBayar);

        input.close();
    }
}