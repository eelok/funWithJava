package Employee;

public class Employee {
	
		private int id;
		private int salary;
		private String firstName;
		private String lastName;
		
		public Employee(int id, String firstName, String lastName, int salary) {
			this.id = id;
			this.salary = salary;
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public int getID() {
			return this.id;
		}
		
		public String getFirstName() {
			return this.firstName;
		}
		
		public String getLastName() {
			return this.lastName;
		}
		
		public String getFullName() {
			return this.firstName + " "+ this.lastName;
		}
		
		public int getSalary() {
			return this.salary;
		}
		
		public int getAnnualSalary() {
			return this.salary * 12;
		}
		
		public int raiseSalary(int percent) {
			return (this.salary * percent/100) + this.salary;
		}
	
		public String toString() {
			return "Employee ID"+
					this.id + 
					", First name: " +
					this.firstName + 
					", Last Name: " + 
					this.lastName+ 
					", salary pro month: " +
					this.salary +
					", salary pro year: " +
					getAnnualSalary();
		}
}
