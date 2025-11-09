import java.util.Scanner;

public class week5_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of Array :");
		int l = sc.nextInt();
		int[] arr = new int[l];
		System.out.println("Enter the elements :");
		for(int i=0;i<l;i++) arr[i] = sc.nextInt();
		System.out.print("Array : ");
		for(int i=0;i<l;i++) System.out.print(arr[i]+" ");
	}
}
