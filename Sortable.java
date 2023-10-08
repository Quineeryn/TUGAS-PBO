package minggu7pt2;

public abstract class Sortable {
    // Metode abstrak yang akan diimplementasikan oleh kelas turunannya
    public abstract int compare(Sortable b);

    // Metode untuk mengurutkan array objek yang dapat diurutkan
    public static void shell_sort(Sortable[] a) {
        int n = a.length;
        
        // Melakukan pengurutan menggunakan algoritma Shell Sort
        for (int interval = n / 2; interval > 0; interval /= 2) {
            for (int i = interval; i < n; i += 1) {
                Sortable temp = a[i];
                int j;

                // Memindahkan elemen-elemen yang lebih besar
                // dari interval ke posisi yang sesuai
                for (j = i; j >= interval; j -= interval) {
                    a[j] = a[j - interval];
                }

                // Menempatkan elemen temp ke posisi yang benar
                a[j] = temp;
            }
        }
    }
}


