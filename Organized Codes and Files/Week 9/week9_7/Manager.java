package week9_7;

class Manager extends Employee {
	String department;
	
	public Manager(String name, double salary, String department) {
		super(name, salary);
		this.department = department;
	}
	
	@Override
	public void showDetails() {
		super.showDetails();
		System.out.println("Department: " + this.department);
	}
}
