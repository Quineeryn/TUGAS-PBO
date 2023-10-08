package minggu_7;

public class TestCylinder {
    public static void main(String[] args) {
        // Membuat instance Cylinder baru dengan nilai default untuk warna, radius, dan tinggi
        Cylinder c1 = new Cylinder();
        System.out.println(c1.toString());

        // Membuat instance Cylinder baru dengan menentukan tinggi, dengan warna dan radius default
        Cylinder c2 = new Cylinder(10.0);
        System.out.println("Cylinder:"
                + " radius=" + c2.getRadius()
                + " height=" + c2.getHeight()
                + " base area=" + c2.getArea()
                + " volume=" + c2.getVolume());

        // Membuat instance Cylinder baru dengan menentukan radius dan tinggi, dengan warna default
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println("Cylinder:"
                + " radius=" + c3.getRadius()
                + " height=" + c3.getHeight()
                + " base area=" + c3.getArea()
                + " volume=" + c3.getVolume());
    }
}
