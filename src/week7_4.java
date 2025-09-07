import java.util.Scanner;

public class week7_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.next().toLowerCase();
		String rev = "";
		for (int i = 0; i < str.length(); i++) {
			rev = str.charAt(i) + rev;
		}
		if (str.equals(rev)) System.out.println("Palindrome");
		else System.out.println("Not Palindrome");
	}
}
