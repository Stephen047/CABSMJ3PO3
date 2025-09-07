import java.util.Scanner;

public class week3_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temp in Celsius : ");
		double temp = sc.nextDouble();
		System.out.println("Fahrenheit = " + (temp*9/5.0+32));
	}
}
