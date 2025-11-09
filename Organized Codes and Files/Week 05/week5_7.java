import java.util.Scanner;

public class week5_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of Array :");
		int l = sc.nextInt();
		int[] arr = new int[l];
		System.out.println("Enter the elements :");
		int max=0;
		for(int i=0;i<l;i++) {
			arr[i] = sc.nextInt();
			if(i==0) max = arr[i];
			if(arr[i] > max) max = arr[i];
		}
		System.out.println("Biggest element = "+max);
	}
}
