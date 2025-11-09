package week9_10;

class Student {
	int rollNo;
	String name;
	double marks;
	static String schoolName = "AMU";
	
	public Student(int rollNo, String name, double marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	public static void changeSchoolName(String newName) {
		schoolName = newName;
	}
	
	public void displayDetails() {
		System.out.println("Roll No: " + this.rollNo);
		System.out.println("Name: " + this.name);
		System.out.println("Marks: " + this.marks);
		System.out.println("School Name: " + schoolName);
		System.out.println("-------------------------");
	}
}
