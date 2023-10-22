package package2;

import java.text.DecimalFormat;

public class PaintThings {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        final double coverage = 350;
        Paint paint = new Paint(coverage);

        Rectangle deck = new Rectangle(20, 35);
        Sphere bigBall = new Sphere(15);
        Cylinder tank = new Cylinder(10, 30);

        double deckamt, ballamt, tankamt;

        // Instantiate the three shapes to paint

        // Compute the amount of paint needed for each shape

        deckamt = paint.amount(deck);
        ballamt = paint.amount(bigBall);
        tankamt = paint.amount(tank);

        // Print the amount of paint for each.
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("Deck " + fmt.format(deckamt));
        System.out.println("BigBall " + fmt.format(ballamt));
        System.out.println("Tank " + fmt.format(tankamt));
    }

}
