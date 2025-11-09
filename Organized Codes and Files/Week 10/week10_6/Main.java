package week10_6;

public class Main {
	public static void main(String[] args) {
		Department csDept = new Department(
				"Stanford University",
				1,
				"School of Engineering",
				"Computer Science",
				"Dr. John Hennessy"
		);
		System.out.println("Calling Display():");
		csDept.Display();
		System.out.println("\nAccessing University Ranking directly:");
		System.out.println("Ranking: " + csDept.ranking);
	}
}