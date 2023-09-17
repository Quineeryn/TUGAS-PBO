package minggu4plus;

//Definisikan kelas 'item'
public class item {
 private String name; // Atribut 'name' yang hanya dapat diakses dalam kelas ini

 // Konstruktor default 'item'
 private item() {
     name = "Ipin"; // Inisialisasi atribut 'name' dengan nilai "Ipin"
 }

 // Konstruktor 'item' dengan argumen
 public item(String name) {
     this(); // Panggil konstruktor default untuk mengatur 'name' selalu "Ipin"
     System.out.println(this.name); // Cetak nilai 'name'
 }
}


