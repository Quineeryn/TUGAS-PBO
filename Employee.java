package minggu7pt2;

//Kelas Employee adalah turunan dari kelas Sortable
public class Employee extends Sortable {

 // Variabel instance untuk data karyawan
 private String name;
 private double salary;
 private int hireday;
 private int hiremonth;
 private int hireyear;

 // Konstruktor untuk membuat objek Employee dengan data yang diberikan
 public Employee(String n, double s, int day, int month, int year) {
     name = n;
     setSalary(s);
     hireday = day;
     hiremonth = month;
     hireyear = year;
 }

 // Metode untuk mencetak informasi karyawan
 public void print() {
     System.out.println(name + " " + getSalary() + " " + hireYear());
 }

 // Metode untuk menaikkan gaji karyawan berdasarkan persentase tertentu
 public void raiseSalary(double byPercent) {
     setSalary(getSalary() * (1 + byPercent / 100));
 }

 // Metode untuk mendapatkan tahun penerimaan karyawan
 public int hireYear() {
     return hireyear;
 }

 // Implementasi metode compare() dari kelas Sortable
 @Override
 public int compare(Sortable b) {
     Employee eb = (Employee) b;
     if (getSalary() > eb.getSalary()) return -1;
     if (getSalary() < eb.getSalary()) return 1;
     return 0;
 }

 // Getter untuk mengambil nilai gaji karyawan
 public double getSalary() {
     return salary;
 }

 // Setter untuk mengatur nilai gaji karyawan
 public void setSalary(double salary) {
     this.salary = salary;
 }
}