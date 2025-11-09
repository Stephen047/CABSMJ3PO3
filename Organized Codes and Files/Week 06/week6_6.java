import java.util.Scanner;

public class week6_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of Array :");
		int l = sc.nextInt();
		int[] arr = new int[l];
		System.out.println("Enter the elements :");
		for(int i=0;i<l;i++) arr[i] = sc.nextInt();
		System.out.println("Enter target :");
		int x = sc.nextInt();
		boolean flag = false;
		int i;
		for(i=0; i<l; i++)
			if (x == arr[i]){
				flag = true;
				break;
			}
		if (flag) System.out.println("Found at index "+i);
		else System.out.println("Not found");
	}
}
