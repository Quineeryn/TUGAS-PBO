package minggu7pt2;

public class EmployeeTest {
    public static void main(String[] args) {
        // Membuat array staff yang berisi objek-objek Employee
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

        // Menggunakan algoritma shell_sort untuk mengurutkan array staff berdasarkan gaji
        Sortable.shell_sort(staff);

        int i;
        // Menaikkan gaji semua karyawan sebesar 5%
        for (i = 0; i < 3; i++) {
            staff[i].raiseSalary(5);
        }

        // Mencetak informasi karyawan yang telah diurutkan dan gaji yang telah dinaikkan
        for (i = 0; i < 3; i++) {
            staff[i].print();
        }
    }
}

