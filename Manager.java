package minggu7pt2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Manager extends Employee {
    private String secretaryName;

    // Konstruktor untuk membuat objek Manager dengan data yang diberikan
    public Manager(String n, double s, int d, int m, int y) {
        super(n, s, d, m, y);
        secretaryName = "";
    }

    // Override metode raiseSalary() dari kelas Employee
    @Override
    public void raiseSalary(double byPercent) {
        // Tambahkan bonus 0.5% untuk setiap tahun masa kerja
        GregorianCalendar todaysDate = new GregorianCalendar();
        int currentYear = todaysDate.get(Calendar.YEAR);
        double bonus = 0.5 * (currentYear - hireYear());
        super.raiseSalary(byPercent + bonus);
    }

    // Metode untuk mendapatkan nama sekretaris
    public String getSecretaryName() {
        return secretaryName;
    }
    
}



