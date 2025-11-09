package week9_10;

public class Main {
	public static void main(String[] args) {
		
		Student student1 = new Student(508, "Shaheer", 95.5);
		Student student2 = new Student(548, "Shafin", 89.0);
		
		System.out.println("Initial Details of All Students\n");
		student1.displayDetails();
		student2.displayDetails();
		
		System.out.println();
		
		Student.changeSchoolName("JMI");
		
		System.out.println("Details After Updating School Name\n");
		student1.displayDetails();
		student2.displayDetails();
	}
}
