package package2;

public class Paint {

    // --------------------
    // Constructor : Sets up the paint object.
    // --------------------

    public Paint(double c) {
    }

    // --------------------
    // Returs the amount of paint (number of gallons)
    // needed to paint the shape given as the parameter.
    // --------------------

    public double amount(Shape s) {

        System.out.println("Computing amount for " + s);
        return s.area();
    }
}
