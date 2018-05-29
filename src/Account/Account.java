package Account;

public class Account {
	
	private String id;
	private String name;
	private int balance;
	
	public Account(String Id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Account(String Id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public String getID() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}

	public int Balance() {
		return this.balance;
	}
}
