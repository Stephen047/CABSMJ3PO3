import java.util.Scanner;

public class week7_1 {
	
	static int search(int[] arr, int x){
		int low = 0;
		int high = arr.length - 1;
		while(low <= high){
			int mid = (low + high)/2;
			if(arr[mid] == x) return mid;
			else if(x < arr[mid]) high = mid-1;
			else low = mid + 1;
		}
		return -1;
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
		System.out.print("Enter the target : ");
		int x = sc.nextInt();
		
		int index = search(arr, x);
		if(index != -1)
			System.out.println("Found at index "+index);
		else
			System.out.println("Not Found");
	}
}
