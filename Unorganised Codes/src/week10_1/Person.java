package week10_1;

class Person {
	String name;
	String phone;
	private Address address;
	private DateOfBirth dob;
	
	public Person(String name, String phone, String houseNo, String street, String city, String state, int day, int month, int year) {
		this.name = name;
		this.phone = phone;
		this.address = new Address(houseNo, street, city, state);
		this.dob = new DateOfBirth(day, month, year);
	}
	public void Display() {
		System.out.println("--- Person Details ---");
		System.out.println("Name: " + this.name);
		System.out.println("Phone: " + this.phone);
		
		this.address.displayAddr();
		this.dob.displayDOB();
		System.out.println("----------------------");
	}
	
	class Address {
		String House_No;
		String Street;
		String City;
		String State;
		
		public Address(String houseNo, String street, String city, String state) {
			this.House_No = houseNo;
			this.Street = street;
			this.City = city;
			this.State = state;
		}
		
		public void displayAddr() {
			System.out.println("Address: " + this.House_No + ", " + this.Street + ", " + this.City + ", " + this.State);
		}
	}
	class DateOfBirth {
		int Day;
		int Month;
		int Year;
		
		public DateOfBirth(int day, int month, int year) {
			this.Day = day;
			this.Month = month;
			this.Year = year;
		}
		
		public void displayDOB() {
			System.out.println("Date of Birth: " + this.Day + "/" + this.Month + "/" + this.Year);
		}
	}
}
