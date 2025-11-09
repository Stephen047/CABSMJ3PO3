import java.util.Scanner;

public class week5_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer :");
		int n = sc.nextInt();
		int copy = n;
		int rev = 0;
		while(copy !=0){
			rev = rev*10 + copy %10;
			copy /=10;
		}
		if(rev == n) System.out.println("Palindrome");
		else System.out.println("Not Palindrome");
	}
}
