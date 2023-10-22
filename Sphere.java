package package2;

public class Sphere extends Shape {
    private double radius;

    // --------------------
    // Constructor : Sets up the sphere.
    // --------------------

    public Sphere(double r) {
        super("Sphere");
        this.radius = r;
    }

    // --------------------
    // Returns the surface area of the sphere.
    // --------------------

    @Override
    public double area() {
        return 4 * Math.PI * radius * radius;
    }

    // --------------------
    // Return the sphere as a stringSs.
    // --------------------
    public String toString() {
        return super.toString() + " of radius " + radius;
    }

}
