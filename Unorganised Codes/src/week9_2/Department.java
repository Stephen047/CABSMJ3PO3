package week9_2;

class Department extends Faculty {
	String deptName;
	String chairman;
	
	public Department(String uniName, int ranking, String facultyName, String deptName, String chairman) {
		super(uniName, ranking, facultyName);
		this.deptName = deptName;
		this.chairman = chairman;
	}
	public void Details() {
		System.out.println("Department: " + this.deptName);
		System.out.println("Chairman: " + this.chairman);
	}
	public void Display() {
		System.out.println("--- Complete Details ---");
		System.out.println("University: " + this.name);
		super.Details();
		this.Details();
	}
}
