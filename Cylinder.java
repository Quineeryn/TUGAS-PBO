package minggu_7;

public class Cylinder extends Circle {
    // Variabel instance untuk menyimpan tinggi silinder (height)
    private double height;

    // Constructor dengan nilai default untuk warna, radius, dan tinggi
    public Cylinder() {
        super(); // Memanggil constructor tanpa argumen dari superclass Circle()
        height = 1.0;
    }

    // Constructor dengan nilai default untuk warna dan radius, tetapi tinggi disetel sesuai dengan nilai yang diberikan
    public Cylinder(double height) {
        super(); // Memanggil constructor tanpa argumen dari superclass Circle()
        this.height = height;
    }

    // Constructor dengan nilai default untuk warna, tetapi radius dan tinggi disetel sesuai dengan nilai yang diberikan
    public Cylinder(double radius, double height) {
        super(radius, "Black"); // Memanggil constructor superclass Circle(r) dengan warna "Black"
        this.height = height;
    }

    // Getter untuk mengambil nilai tinggi
    public double getHeight() {
        return height;
    }

    // Method publik untuk menghitung volume silinder
    // Menggunakan method getArea() dari superclass untuk mendapatkan luas dasar silinder
    public double getVolume() {
        return super.getArea() * height;
    }

    // Override method getArea() dari superclass untuk menghitung luas permukaan silinder
    @Override
    public double getArea() {
        return 2 * Math.PI * super.getRadius() * height + (2 * super.getArea());
    }

    // Override method toString() dari superclass untuk mengembalikan representasi string dari objek Cylinder
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }
}
