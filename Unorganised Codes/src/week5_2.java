import java.util.Scanner;

public class week5_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of Array :");
		int l = sc.nextInt();
		int[] arr = new int[l];
		int sum=0;
		System.out.println("Enter the elements :");
		for(int i=0;i<l;i++) {
			arr[i] = sc.nextInt();
			sum+=arr[i];
		}
		System.out.println("Sum of all elements = "+sum);
	}
}
