package week9_6;

class Rectangle extends Shape {
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	public void area() {
		double result = length * width;
		System.out.println("Area of Rectangle is: " + result);
	}
}
