public class Circle implements Shape {
	private double radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public double getArea() {
		return (Math.PI * Math.pow(radius, 2));
	}

	public double getPerimeter() { // *Circumference
		double diameter = radius * 2;
		return Math.PI * diameter;
	}
}
