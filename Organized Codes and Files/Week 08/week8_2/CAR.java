package week8_2;

public class CAR {
	private String color;
	private String model;
	private double price;
	
	CAR(String color, String model){
		this.color = color;
		this.model = model;
		this.price = 0;
	}
	CAR(String color){
		this(color, "Unknown");
	}
	CAR(){
		color = "Unknown";
		model = "Unknown";
		price = 0;
	}
	
	public void setDetails(String color, String model, double price){
		this.color = color;
		this.model = model;
		this.price = price;
	}
	
	public void getDetails(){
		display();
	}
	
	public void display(){
		System.out.println("Color : "+color);
		System.out.println("Model : "+ model);
		System.out.println("Price : $"+price);
	}
}
