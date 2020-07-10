package ml.Boettger.Class_Objects_1_Task_2_Account_comparison;

public class Account 
{
	private Person person;
	private double bank_balance;
	
	public Account (String name, String first_name, float bank_balance)
	{	
		this.setPerson(new Person(name, first_name));
		this.bank_balance = bank_balance;
		if (AccountTest.isTestmode())
		{	
			System.out.println(
				"\t-------------------------------------------------------\n" +
				"\tctor " + this.toString());
		}	
	}

	public Person getPerson() 
	{
		return this.person;
	}

	public void setPerson(Person person)
	{
		this.person = person;
	}

	public double getBank_balance() 
	{
		return this.bank_balance;
	}

	public void setBank_balance(double bank_balance)
	{
		this.bank_balance = bank_balance;
	}

	public String toString() 
	{
		return "\t\tAccount\n" +
			   "\t--------------------------------------------------------\n" +			
			   "\tperson = " + this.getPerson() + "\n" + 
			   "\tbank_balance = " + this.getBank_balance() + "\n";
	}
}
