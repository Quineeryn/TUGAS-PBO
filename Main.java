package minggu7pt2;

public class Main {
	 public static void main(String[] args) {
	        // Test Shape class
	        Shape shape1 = new Shape();
	        System.out.println(shape1);

	        Shape shape2 = new Shape("red", false);
	        System.out.println(shape2);
	        System.out.println("=============");
	        
	        // Test Circle class
	        Circle circle1 = new Circle();
	        System.out.println(circle1);

	        Circle circle2 = new Circle(2.5);
	        System.out.println(circle2);

	        Circle circle3 = new Circle(3.0, "blue", true);
	        System.out.println(circle3);
	        System.out.println("=============");
	        
	        // Test Rectangle class
	        Rectangle rectangle1 = new Rectangle();
	        System.out.println(rectangle1);

	        Rectangle rectangle2 = new Rectangle(4.0, 5.0);
	        System.out.println(rectangle2);

	        Rectangle rectangle3 = new Rectangle(3.0, 6.0, "yellow", false);
	        System.out.println(rectangle3);
	        System.out.println("=============");
	        
	        // Test Square class
	        Square square1 = new Square(3.0);
	        System.out.println(square1);

	        Square square2 = new Square(4.5);
	        System.out.println(square2);

	        // Modify a square and check if it maintains the square geometry
	        square2.setWidth(5.0);
	        System.out.println(square2);
	        square2.setLength(6.0); // Should also change width
	        System.out.println(square2);
	    }
}
