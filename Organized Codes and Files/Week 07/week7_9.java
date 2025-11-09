public class week7_9 {
	static int partition(int[] arr, int low, int high) {
		
		int pivot = arr[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		//putting pivot (high) in front of last exchange
		swap(arr, i + 1, high);
		return i + 1;
	}
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			//pi is pivot index
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {10, 7, 8, 9, 1, 5};
		int n = arr.length;
		
		quickSort(arr, 0, n - 1);
		
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}
}
