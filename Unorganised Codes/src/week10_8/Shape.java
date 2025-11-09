package week10_8;

class Shape {
	public void area(int side) {
		int result = side * side;
		System.out.println("Area of the Square: " + result);
	}
	public void area(int length, int breadth) {
		int result = length * breadth;
		System.out.println("Area of the Rectangle: " + result);
	}
	public void area(double radius) {
		double result = Math.PI * radius * radius;
		System.out.printf("Area of the Circle: %.2f\n", result);
	}
}
