package ml.Boettger.Class_Objects_1_Task_2_Account_comparison;

public class AccountTest 
{
	//########################################################################
	//
	//	Here you can switch on/off the testmode
	//
	final public static boolean testMode = true;	// testmode true/false
	//
	//########################################################################
	
	public static boolean isTestmode() 
	{
		return testMode;
	}

	public static void account_comparison(Account ref_A1, Account ref_A2)
	{
		// get person references
		Person p1 = ref_A1.getPerson();
		Person p2 = ref_A2.getPerson();
				
		if (ref_A1.getBank_balance() == ref_A2.getBank_balance())
		{	
			System.out.println("\t" +					
				p1.getFirst_name() + " " + p1.getName() + " and " +
				p2.getFirst_name() + " " + p2.getName() + 
					" have the same amount of money in the account.");
		}	
		else if (ref_A1.getBank_balance() > ref_A2.getBank_balance())
		{
			System.out.println("\t" +
				p1.getFirst_name() + " " + p1.getName() +  
				" has more money in the account as " +
				p2.getFirst_name() + " " + p2.getName() + ".");
		}	
		else
		{	
			System.out.println("\t" +
				p2.getFirst_name() + " " + p2.getName() + 
				" has more money in the account as " +
				p1.getFirst_name() + " " + p1.getName() + ".");
		}		
	}
	
	public static void main (String[] args)
	{		
		Account account1 = new Account ("Mueller", "Hans", 500);
		Account account2 = new Account ("Krause", "Peter", 1500);
		Account account3 = new Account ("Boehm", "Harald", 330);
		Account account4 = new Account ("Meyer", "Johann", 330);
		
		System.out.println();
		System.out.println("\tAccount comparison");
		System.out.println(
			"\t-------------------------------------------------------------");
		account_comparison (account1, account2);
		account_comparison (account2, account3);
		account_comparison (account1, account3);
		account_comparison (account3, account4);
	}
}
