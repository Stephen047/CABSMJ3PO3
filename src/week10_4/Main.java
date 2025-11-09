package week10_4;

public class Main {
	public static void main(String[] args) {
		
		JavaLanguage myJava = new JavaLanguage();
		System.out.println("Accessing Parent's Methods (from ObjectOriented)");
		myJava.abstraction();
		myJava.polymorphism();
		myJava.inheritance();
		
		System.out.println("\nAccessing Own Methods (from JavaLanguage)");
		myJava.persistence();
		myJava.interfaces();
		
		Cpp myCpp = new Cpp();
		System.out.println("\nAccessing Parent's Methods (from ObjectOriented)");
		myCpp.abstraction();
		myCpp.polymorphism();
		myCpp.inheritance();
		
		System.out.println("\nAccessing Own Methods (from CppLanguage)");
		myCpp.template();
		myCpp.friendFunction();
	}
}
