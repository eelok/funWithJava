package Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee person1 = new Employee(1234, "Nick", "Veerov", 10000);
		
				person1.getID();
				person1.getFirstName();
				person1.getLastName();
				person1.getFullName();
				person1.getSalary();
				person1.getAnnualSalary();
				person1.raiseSalary(10);
				person1.toString();
				System.out.println(person1.toString());
	}

}
