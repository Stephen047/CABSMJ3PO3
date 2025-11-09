package week10_6;

class Faculty extends University {
	String name;
	
	public Faculty(String uniName, int ranking, String facultyName) {
		super(uniName, ranking);
		this.name = facultyName;
	}
	public void Details() {
		System.out.println("University: " + super.name);
		System.out.println("Faculty: " + this.name);
	}
}
