package Inheritance;

class Shape {
	String color;

	public Shape(String color) {
		this.color = color;
	}

	public void CalculatorArea() {
		System.out.println("Calculating area (Generic implementation)");
	}
}

class Circle extends Shape {

	double radius;

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	public void CalculatorArea() {
		double area = Math.PI * radius * radius;
		System.out.println("Area Of Circle :" + area);
	}
}

class Rectangle extends Shape {
	double length;
	double width;

	public Rectangle(String color, double length, double width) {
		super(color);
		this.length = length;
		this.width = width;

	}

	public void CalculatorArea() {
		double area = length * width;
		System.out.println("Area of Rectangle:" + area);
	}
}

public class HierarchicalInheritanceDemo {
	public static void main(String[] args) {
		Circle circle = new Circle("Red", 10.0);
		Rectangle rectangle = new Rectangle("Blue", 4, 6);
		circle.CalculatorArea();
		rectangle.CalculatorArea();

	}

}
