public class ShapeTesting {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[3];
		shapes[0] = new Circle(12); // Change number in parentheses
		shapes[1] = new Rectangle(10, 20); // Change numbers in parentheses
		shapes[2] = new Triangle(30, 30, 30); // Change numbers in parentheses
		String[] shapenames = { "Circle", "Rectangle", "Triangle" };
		for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapenames[i] + " Area/Circumference: ");
			System.out.println("Area: " + shapes[i].getArea());
			System.out.println("Perimeter: " + shapes[i].getPerimeter());
			System.out.println();
		}
	}
}
