public class week4_2 {
	public static void main(String[] args) {
		int a=5, b=10, c=15;
		if (a>b) {
			if (a>c) System.out.println("Greatest = " + a);
			else System.out.println("Greatest = " + c);
		}
		else{
			if (b>c) System.out.println("Greatest = "+b);
			else System.out.println("Greatest = "+c);
		}
	}
}
