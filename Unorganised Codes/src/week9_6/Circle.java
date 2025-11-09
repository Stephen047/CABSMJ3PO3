package week9_6;

class Circle extends Shape {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public void area() {
		double result = Math.PI * radius * radius;
		System.out.printf("Area of Circle is: %.2f\n", result);
	}
}
