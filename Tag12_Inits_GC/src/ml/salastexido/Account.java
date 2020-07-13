package ml.salastexido;

public class Account {
	private Person person;
	private double accountBalance;
	
	public Account(Person person,double accountBalance) {
		this.person = person;
		this.accountBalance = accountBalance;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	
}
