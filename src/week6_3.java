import java.util.Scanner;

public class week6_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of Array :");
		int l = sc.nextInt();
		int[] arr = new int[l];
		System.out.println("Enter the elements :");
		for(int i=0;i<l;i++) arr[i] = sc.nextInt();
		System.out.println("Current Array :");
		for(int i=0;i<l;i++) System.out.print(arr[i]+", ");
		System.out.println();
		int temp = arr[l - 1];
		arr[l - 1] = arr[0];
		arr[0] = temp;
		System.out.println("After swap :");
		for(int i=0;i<l;i++) System.out.print(arr[i]+", ");
	}
}
