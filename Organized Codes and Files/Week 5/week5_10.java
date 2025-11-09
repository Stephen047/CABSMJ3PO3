import java.util.Scanner;

public class week5_10 {
	
	static String decimalToHex(int num) {
		if (num == 0) return "0";
		String hex = "";
		char[] hexDigits = "0123456789ABCDEF".toCharArray();
		while (num > 0) {
			int rem = num % 16;
			hex = hexDigits[rem] + hex;
			num = num / 16;
		}
		return hex;
	}
	
	static int hexToDecimal(String hex) {
		int dec = 0;
		hex = hex.toUpperCase();
		for (int i = 0; i < hex.length(); i++) {
			char ch = hex.charAt(i);
			int value;
			if (ch >= '0' && ch <= '9') {
				value = ch - '0';
			} else {
				value = ch - 'A' + 10;
			}
			dec = dec * 16 + value;
		}
		return dec;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Decimal to Hex");
		System.out.println("2. Hex to Decimal");
		System.out.print("Choose option: ");
		int choice = sc.nextInt();
		sc.nextLine(); //clears input buffer
		
		switch (choice) {
			case 1:
				System.out.print("Enter decimal number: ");
				int dec = sc.nextInt();
				String hex = decimalToHex(dec);
				System.out.println("Hexadecimal: " + hex);
				break;
			
			case 2:
				System.out.print("Enter hexadecimal number: ");
				String hexInput = sc.nextLine();
				int decimal = hexToDecimal(hexInput);
				System.out.println("Decimal: " + decimal);
				break;
			
			default:
				System.out.println("Invalid option");
		}
	}
}

