package week12_2;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
	public void f1() {
		System.out.println("f1: Calling f2() (Inside try-catch block)");
		try {
			f2();
		} catch (IOException e) {
			System.out.println("f1: Exception was caught!");
			System.out.println("f1: Error Details: " + e.getMessage());
		}
		System.out.println("f1: This Line Not Executed.");
	}
	public void f2() throws IOException {
		System.out.println("  f2: Calling f3()");
		f3();
		System.out.println("  f2: This Line Not Executed.");
	}
	public void f3() throws IOException {
		System.out.println("    f3: Trying to read a non-existent file");
		FileInputStream fis = new FileInputStream("random.txt");
		System.out.println("    f3: This Line Not Executed.");
	}
	public static void main(String[] args) {
		Main demo = new Main();
		demo.f1();
	}
}
