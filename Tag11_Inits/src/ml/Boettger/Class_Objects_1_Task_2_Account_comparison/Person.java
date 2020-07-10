package ml.Boettger.Class_Objects_1_Task_2_Account_comparison;

public class Person
{
	private String name;
	private String first_name;
	
	public void setName (String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setFirst_name (String first_name)
	{
		this.first_name = first_name;
	}
	
	public String getFirst_name()
	{
		return this.first_name;
	}

	public String toString() 
	{
		return "\t\tPerson\n" +
			   "\t--------------------------------------------------------\n" +			
			   "\tname = " + this.getName() + "\n" + 
	           "\tfirst_name = " + this.getFirst_name() + "\n";
	}
	
	public Person()
	{
		this("Mustermann");
		
		if (AccountTest.isTestmode())
		{	
			System.out.println(
				"\t-------------------------------------------------------\n" +
				"\tctor Person:\n" + this.toString());
		}	
	}
	
	public Person(String name)
	{
		this(name, "Max");
	}
	
	public Person(String name, String first_name)
	{
		this.setName(name);
		this.setFirst_name(first_name);
	}		
}