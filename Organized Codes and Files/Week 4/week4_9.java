public class week4_9 {
	public static void main(String[] args) {
		int y=2024;
		if(y%400 == 0)
			System.out.println("Leap year");
		else if (y%4 == 0 && y%100 != 0)
			System.out.println("Leap year");
		else
			System.out.println("Not Leap Year");
	}
}
