package minggu7pt2;

public class ManagerTest {
    public static void main(String[] args) {
        // Membuat array staff yang berisi objek-objek Employee dan Manager
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

        Sortable.shell_sort(staff);
        
        int i;
        // Menaikkan gaji semua karyawan (termasuk Manager) sebesar 5%
        for (i = 0; i < 3; i++) {
            staff[i].raiseSalary(5);
        }

        // Mencetak informasi karyawan yang telah diurutkan dan gaji yang telah dinaikkan
        for (i = 0; i < 3; i++) {
            staff[i].print();
        }
    }
}

 