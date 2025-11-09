package week8_1;

public class FRUIT {
	private String color;
	private String taste;
	private double price;
	
	FRUIT(String color, String taste){
		this.color = color;
		this.taste = taste;
		this.price = 0;
	}
	FRUIT(String color){
		this(color, "Unknown");
	}
	FRUIT(){
		color = "Unknown";
		taste = "Unknown";
		price = 0;
	}
	
	public void setDetails(String color, String taste, double price){
		this.color = color;
		this.taste = taste;
		this.price = price;
	}
	
	public void display(){
		System.out.println("Color : "+color);
		System.out.println("Taste : "+taste);
		System.out.println("Price : $"+price);
	}
}
