public class week7_7 {
	static int gcd(int a, int b){
		while(a%b != 0){
			int r = a%b;
			a = b;
			b = r;
		}
		return b;
	}
	static int gcd_rec(int a, int b){
		if (a%b == 0) return b;
		return gcd_rec(b, a%b);
	}
	
	public static void main(String[] args) {
		System.out.println(gcd(15, 100));
		System.out.println("With Recursion : ");
		System.out.println(gcd_rec(15, 100));
	}
}
