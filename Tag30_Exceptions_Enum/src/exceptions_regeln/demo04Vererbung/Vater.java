package exceptions_regeln.demo04Vererbung;

public class Vater {

	/*
	 * keine Exception
	 */
	public void except01() {}
	/*
	 * Exception
	 */
	public void except02() throws Exception{}
	/*
	 * ReflectiveOperationException
	 */
	public void except03() throws ReflectiveOperationException{}
	/*
	 * ArrayIndexOutOfBoundsException
	 */
	public void runExcept01() throws ArrayIndexOutOfBoundsException{}
	
	public Vater()throws Exception{}
	
	
	
	
	
	
	
}
