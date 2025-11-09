package week9_2;

public class Main {
	public static void main(String[] args) {
		Department csDept = new Department("AMU", 8, "F/O Science", "CS Dept.", "Mr. A.R. Faridi");
		
		csDept.Display();
		
		System.out.println("------------------------");
		System.out.println("University Ranking: " + csDept.ranking);
	}
}