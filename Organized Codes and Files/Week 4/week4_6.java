import java.util.Scanner;

public class week4_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter char :");
		char c = sc.nextLine().charAt(0);
		c = Character.toUpperCase(c);
		if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
			System.out.println("Vowel");
		else System.out.println("Consonant");
	}
}
