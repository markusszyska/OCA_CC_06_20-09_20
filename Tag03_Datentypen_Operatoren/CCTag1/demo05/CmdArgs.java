public class CmdArgs{
	
	public static void main(String[] args){
		int x = 0;
		for(String s : args){
			System.out.println(x++ + " element = " + s);
		}
	}
}