package demo_String_StringBuilder;

public class DemoStringBufferBuilder {
	// A common use for StringBuffers and StringBuilders is file
	// I/O when large, ever-changing streams of input are being handled
	// by the program. In these cases, large blocks of characters are handled as
	// units, and StringBuffer objects are the ideal way to handle a block of
	// data, pass it on, and then reuse the same memory to handle the next block
	// of data.

	// The StringBuilder class was added in Java 5. It has exactly the same
	// API as the StringBuffer class, except StringBuilder is not thread safe.
	
	public static void main(String[] args) {
		StringBuffer sBuffer = new StringBuffer("abcdef");
		StringBuilder sBuilder = new StringBuilder("abcdef");
		
		System.out.println("sBuffer: " + sBuffer);
		System.out.println("sBuilder: " + sBuilder);
		
		//replace()
		System.out.println("\n ------ replace() ------");
		sBuffer.replace(1, 5, "HU");
		System.out.println("sBuffer: " + sBuffer);
		sBuilder.replace(1, 5, "HU"); 
		System.out.println("sBuilder: " + sBuilder);
		
		//delete()
		System.out.println("\n ------ delete() ------");
		sBuffer.delete(3, 4);
		System.out.println("sBuffer: " + sBuffer);
		sBuilder.delete(3, 4);
		System.out.println("sBuilder: " + sBuilder);
		
		//append()
		System.out.println("\n ------ append() ------");
		sBuffer.append("gh");
		System.out.println("sBuffer: " + sBuffer);
		sBuilder.append("gh");
		System.out.println("sBuilder: " + sBuilder);
		
		//reverse()
		System.out.println("\n ------ reverse() ------");
		sBuffer.reverse();
		System.out.println("sBuffer: " + sBuffer);
		sBuilder.reverse();
		System.out.println("sBuilder: " + sBuilder);
		
		//insert()
		System.out.println("\n ------ insert() ------");
		sBuffer.insert(1, "---------");
		System.out.println("sBuffer: " + sBuffer);
		sBuilder.insert(1, "---------");
		System.out.println("sBuilder: " + sBuilder);
		
		//toString()
		System.out.println(sBuilder);		
		String s = sBuilder.toString();
		
//		sBuilder.concat(); StringBuilder hat kein concat();
//		s.append();	String hat kein append()
	}
	
}
