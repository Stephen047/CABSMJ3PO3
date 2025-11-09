import java.util.Scanner;

public class week6_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N :");
		int n = sc.nextInt();
		if (n >= 1) System.out.print("0 ");
		if (n >= 2) System.out.print("1 ");
		if (n >= 3){
			int a = 0, b = 1;
			int c;
			for (int i = 2; i <= n; i++){
				c = a+b;
				a = b;
				b = c;
				System.out.print(c+" ");
			}
		}
	}
}
