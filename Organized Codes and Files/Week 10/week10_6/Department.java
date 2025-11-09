package week10_6;

class Department extends Faculty {
	String name;
	String chairman;
	
	public Department(String uniName, int ranking, String facultyName, String deptName, String chairman) {
		
		super(uniName, ranking, facultyName);
		
		this.name = deptName;
		this.chairman = chairman;
	}
	@Override
	public void Details() {
		System.out.println("Department: " + this.name);
		System.out.println("Chairman: " + this.chairman);
	}
	public void Display() {
		super.Details();
		this.Details();
	}
}
