import java.util.Scanner;

public class week5_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer :");
		int n = sc.nextInt();
		int rev = 0;
		while(n!=0){
			rev = rev*10 + n%10;
			n/=10;
		}
		System.out.println("Reverse = "+ rev);
	}
}
