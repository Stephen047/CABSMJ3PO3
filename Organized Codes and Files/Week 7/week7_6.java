public class week7_6 {
	
	static void fib(int n){
		if (n >= 1) System.out.print("0 ");
		if (n >= 2) System.out.print("1 ");
		if (n > 2) {
			int a = 0;
			int b = 1;
			for (int i = 3; i <= n; i++) {
				int c = a + b;
				a = b;
				b = c;
				System.out.print(c + " ");
			}
		}
	}
	static void fib_rec(int n, int a, int b){
		if(n > 0){
			System.out.print(a + " ");
			fib_rec(n-1, b, a+b);
		}
	}
	
	public static void main(String[] args) {
		fib(10);
		System.out.println("\nWith recursion : ");
		fib_rec(10, 0, 1);
	}
}
