import java.util.Scanner;

public class week6_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String str = sc.nextLine();
		for (int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			int count = 0;
			for (int j = 0; j < str.length(); j++) if (str.charAt(j) == c) count++;
			System.out.println("Freq of "+c+" = "+count);
		}
	}
}
