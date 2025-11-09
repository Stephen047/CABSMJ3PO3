
public class test {
	
	static void printMatrix(int[][] arr, int m, int n){
		for (int i = 0; i<m; i++){
			for (int j =0; j<n; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	static void multiply(int[][] a, int[][] b, int[][] c, int m, int n, int p){
		for(int i = 0; i<m; i++){
			for(int j = 0; j<p; j++){
				for(int k = 0; k<n; k++){
					c[i][j] += a[i][k] * b[k][j];	//final array m x p
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] a = {{1,1,1}, {2,2,2}, {3,3,3}, {4,4,4}};
		int[][] b = {{1,1,1,1}, {2,2,2,2}, {3,3,3,3}};
		
		int r1 = a.length;
		int c1 = a[0].length;
		int r2 = b.length;
		int c2 = b[0].length;
		
		System.out.println("Matrix 1 : ");
		printMatrix(a,r1,c1);
		System.out.println("Matrix 2 : ");
		printMatrix(b,r2,c2);
		
		if(c1 == r2){
			int[][] c = new int[r1][c2];
			multiply(a,b,c,r1,c1,c2);
			System.out.println("Result : ");
			printMatrix(c,r1,c2);
		}
		else {
			System.out.println("c2 and r1 should be equal");
		}
	}
}
