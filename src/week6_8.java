import java.util.Scanner;

public class week6_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of Array :");
		int l = sc.nextInt();
		int[] arr = new int[l];
		System.out.println("Enter the elements :");
		int maxi =0;
		for(int i=0;i<l;i++) {
			arr[i] = sc.nextInt();
			if(arr[i] > arr[maxi]) maxi = i;
		}
		int m2 =arr[0];
		for(int i=0;i<l;i++) {
			if(i == maxi) continue;
			if(arr[i] > m2) m2 = arr[i];
		}
		System.out.println("2nd Biggest : "+m2);
	}
}
