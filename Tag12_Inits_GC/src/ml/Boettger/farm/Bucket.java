package ml.Boettger.farm;

public class Bucket 
{	
	private static int id = 0;
	private float filling_quantity;			// in L
	private float max_filling_quantity;		// >= filling quantity in L
	
	//#########################################################################
	// getter and setter
	//#########################################################################
	
	public int getId()
	{
		return id;
	}
	
	public float getFilling_quantity() 
	{
		return filling_quantity;
	}
	
	public void setFilling_quantity(float filling_quantity) 
	{
		this.filling_quantity = filling_quantity;
	}
	
	public float getMax_filling_quantity() 
	{
		return max_filling_quantity;
	}
	
	public void setMax_filling_quantity(float max_filling_quantity) 
	{
		this.max_filling_quantity = max_filling_quantity;
	}

	//#########################################################################
	// default constructor without paramters
	//#########################################################################
	
	public Bucket()
	{
		// creates an empty bucket
		this(0.00f);		
	}
	
	//#########################################################################
	// other constructors without paramters
	//#########################################################################
	
	public Bucket(float filling_quantity)
	{
		this(filling_quantity, 30.0f);
	}
	
	//#########################################################################
	// constructor with all attributes
	//#########################################################################
	
	public Bucket(float filling_quantity, float max_filling_quantity) 
	{
		Bucket.id = this.getId() + 1;
		this.setFilling_quantity(filling_quantity);
		this.setMax_filling_quantity(max_filling_quantity);
		
		if (FarmMain.isTESTMODE())
		{
			System.out.println(FarmMain.CTOR + this.toString());
			FarmMain.pause();
		}
	}	
	
	// public functions...
	
	//#########################################################################
	//
	public String toString()
	//
	//#########################################################################
	{
		return
			"\t-----------------------------------------------------------\n" +	
			"\t\tBucket                                                   \n" +
			"\t-----------------------------------------------------------\n" + 
			"\tid                   = " + this.getId()                 + "\n" +
			"\tfilling_quanity      = " + this.getFilling_quantity()   + "\n" +
			"\tmax_filling_quantity = " + this.getMax_filling_quantity()+"\n" +
			"\t-----------------------------------------------------------\n";
	}
	
	//#########################################################################
	public boolean is_filled(float amount_of_milk)
	//
	//	returns true, if bucket was filled up
	//  returns false, if bucket was not filled up
	//
	//#########################################################################
	{
		System.out.println(
			"\tBucket --- Filled with " + this.getFilling_quantity() + " L.");
		
		if (amount_of_milk <= 0.0f)
		{	
			System.out.println(
				"\tBucket --- Filling with " + amount_of_milk + 
					" L not possible.");
			
			return false;
		}
		else if (this.getFilling_quantity() + amount_of_milk > 
			this.getMax_filling_quantity())
		{
			System.out.println(
				"\tBucket --- Filling with " + amount_of_milk + 
					" L not possible, because ");
			
			System.out.println(
				"Bucket will run over if more then " + 
					this.getMax_filling_quantity() + " L.");	
			
			System.out.println(
				"\tBucket --- Filling quantity unchanged " + 
					this.getFilling_quantity() + " L.");
			
			return false;
		}
		else
		{
			System.out.println(
				"\tBucket --- Filling with " + amount_of_milk + 
					" L is possible.");
			
			this.setFilling_quantity(
				this.getFilling_quantity() + amount_of_milk);
			
			System.out.println(
				"\tBucket --- New filling qauntity is now " + 
					this.getFilling_quantity() + " L.");
					
			return true;
		}
	}
}	
