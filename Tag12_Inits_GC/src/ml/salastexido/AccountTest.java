package ml.salastexido;

public class AccountTest {
	
	public static void checkAccounts(Account a1, Account a2) {
		if(a1.getAccountBalance()>a2.getAccountBalance()) {
			System.out.println(a1.getPerson() + " hat mehr Geld auf dem Konto als " + a2.getPerson());
		}else {
			System.out.println(a2.getPerson() + " hat mehr Geld auf dem Konto als " + a1.getPerson());
		}
	}
	
	public static void main(String[] args) {
		Account a1 = new Account(new Person("Muller","Hans"),500);
		Account a2 = new Account(new Person("Krause","Peter"),1500);
		Account a3 = new Account(new Person("Bohm","Harald"),330);
		checkAccounts(a1, a2);
		checkAccounts(a2, a3);
		checkAccounts(a1, a2);
		
	}

}
