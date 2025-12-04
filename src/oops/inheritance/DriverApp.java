package oops.inheritance;

public class DriverApp {
	public static void main(String[] args) {
		Person p = new Person();
		
		p.acceptPerson();
		p.displayPerson();
		
		Employee e = new Employee();
		e.acceptEmployee();
		e.acceptPerson();
		e.displayEmployee();
		e.displayPerson();
	}

}
