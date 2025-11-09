package week9_2;

class Faculty extends University {
	String facultyName;
	
	public Faculty(String uniName, int ranking, String facultyName) {
		super(uniName, ranking);
		this.facultyName = facultyName;
	}
	
	public void Details() {
		System.out.println("Faculty: " + this.facultyName);
	}
}
