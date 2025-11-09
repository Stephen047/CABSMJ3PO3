import java.util.Scanner;

public class week6_10 {
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
		for (int i=0;i<l/2;i++){
			int temp = arr[i];
			arr[i] = arr[l-1-i];
			arr[l-1-i] = temp;
		}
		System.out.println("Current Array :");
		for(int i=0;i<l;i++) System.out.print(arr[i]+", ");
	}
}
