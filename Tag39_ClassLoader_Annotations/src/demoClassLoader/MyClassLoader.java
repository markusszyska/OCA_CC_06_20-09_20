package demoClassLoader;

public class MyClassLoader extends ClassLoader{
	
	public Class<?> findClass(String pQualifiedClassName, byte[] pBytecode){
		return defineClass(pQualifiedClassName, pBytecode, 0, pBytecode.length);
	}
	
}
