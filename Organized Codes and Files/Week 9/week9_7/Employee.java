package week9_7;

class Employee {
	String name;
	double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public void showDetails() {
		System.out.println("Name: " + this.name);
		System.out.println("Salary: " + this.salary);
	}
}
