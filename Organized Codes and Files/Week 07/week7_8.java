import java.util.Arrays;
import java.util.Scanner;

public class week7_8 {
	
	static String sort(String str){
		char[] temp = str.toLowerCase().toCharArray();
		Arrays.sort(temp);
		return new String(temp);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("String 1 : ");
		String s1 = sc.nextLine();
		System.out.print("String 2 : ");
		String s2 = sc.nextLine();
		if ((sort(s1).trim()).equals(sort(s2).trim()))
			System.out.println("Anagrams");
		else System.out.println("Not Anagrams");
	}
}
// Examples - Listen, Silent; Heart, Earth; The Eyes, They see; Debit Card, Bad Credit;