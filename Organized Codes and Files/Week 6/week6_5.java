public class week6_5 {
	public static void main(String[] args) {
		Outer : for (int i=0; i<=100; i++){
			if (i == 0 || i == 1) continue;
			for (int j=2; j<i; j++) if (i%j == 0) continue Outer;
			System.out.println(i);
		}
	}
}
