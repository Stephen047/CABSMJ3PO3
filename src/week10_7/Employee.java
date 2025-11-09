package week10_7;

class Employee {
	String empName;
	int empId;
	private Salary salary;
	private JoiningDate joiningDate;
	public Employee(String empName, int empId, double basic, double hra, double pf, int day, int month, int year) {
		this.empName = empName;
		this.empId = empId;
		this.salary = new Salary(basic, hra, pf);
		this.joiningDate = new JoiningDate(day, month, year);
	}
	public void displayEmployee() {
		System.out.println("Employee Name: " + this.empName);
		System.out.println("Employee ID: " + this.empId);
		this.salary.displaySalary();
		this.joiningDate.displayJoiningDate();
	}
	class Salary {
		double basic;
		double hra;
		double pf;
		
		public Salary(double basic, double hra, double pf) {
			this.basic = basic;
			this.hra = hra;
			this.pf = pf;
		}
		public void displaySalary() {
			double total = (this.basic + this.hra) - this.pf;
			System.out.println("Salary Details for: " + empName);
			System.out.println("Basic Pay: " + this.basic);
			System.out.println("HRA: " + this.hra);
			System.out.println("PF: " + this.pf);
			System.out.println("Total Salary: " + total);
		}
	}
	class JoiningDate {
		int day;
		int month;
		int year;
		public JoiningDate(int day, int month, int year) {
			this.day = day;
			this.month = month;
			this.year = year;
		}
		public void displayJoiningDate() {
			System.out.println("Joining Date: " + this.day + "/" + this.month + "/" + this.year);
		}
	}
}
