package package2;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double l, double w) {
        super("Rectangle");
        this.length = l;
        this.width = w;
    }

    @Override
    public double area() {
        return this.width * this.length;
    }

    public String toString() {
        return super.toString() + " of length " + this.length + " and of width " + this.width;
    }
}
