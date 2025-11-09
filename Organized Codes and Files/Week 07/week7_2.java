import java.util.Scanner;

public class week7_2 {
	
	static void sort(int[] arr){
		for (int i = 0; i < arr.length - 1; i++) {
			boolean swapped = false;
			for (int j = 0; j < arr.length - 1 - i; j++)
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			if(!swapped) return;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length :");
		int l = sc.nextInt();
		int[] arr = new int[l];
		System.out.println("Enter elements : ");
		for (int i = 0; i < l; i++) {
			arr[i] = sc.nextInt();
		}
		sort(arr);
		System.out.println("Sorted Array :");
		for (int j : arr) {
			System.out.print(j + " ");
		}
	}
}
