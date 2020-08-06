package exceptions_regeln.demo03MultipleExceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo01MultipleExceptions {
	public static void main(String[] args) {

		/*
		 * Wenn beide von der Methode deklarierten Exception
		 * in der gleichen Verbungshirarchie liegen reicht es,
		 * die allgemeinere abzufangen
		 */
		try {
			multiple01(0);
		} catch (IOException ioe) {

		}
		/*
		 * Man kann auch beide abfangen, mindestens die allgemeinere MUSS
		 * abgefangen werden.
		 * Auch hier muss die speziellere vor der allgemeineren stehen
		 */
		try {
			multiple01(0);
		} 
		catch(FileNotFoundException fnfe) {
			
		}
		catch (IOException ioe) {

		}
		//----------------------------------------------
		/*
		 * Liegen beide deklarierten Exceptions nicht in der gleichen 
		 * Hirarchie, muessen beide abgefangen werden.
		 * Dabei hat man dre Moeglichkeiten:
		 * 1. Eine allgemeinere Elternexception von beiden abzufangen
		 * 2. Multicatch
		 * 3. Ein Catchblock mit veroderten Exceptions. Diese
		 * werden dann durch eine Pipe getrennt notiert
		 * 
		 */
		try {
			multiple01_2(0);
		}catch(Exception e) {
			
		}
		
		try {
			multiple01_2(0);
		}catch(ClassNotFoundException cnfe) {
			
		}catch(FileNotFoundException fnfe) {
			
		}
		
		try {
			multiple01_2(0);
		}catch(FileNotFoundException | ClassNotFoundException e) {
			
		}
		//----------------------------------------------
		/*
		 * Ist eine der beiden Exceptions unchecked,
		 * kann sie abgefangen werden, muss sie aber nicht
		 */
		try {
			multiple02(0);
		}catch(IOException ioe) {
			
		}
		
		try {
			multiple02(0);
		}catch(RuntimeException | IOException e) {
			
		}
		//----------------------------------------------
		/*
		 * Sind beide deklarierten Exceptions unchecked, kann man keine,
		 * eine oder beide abfangen.
		 */
		multiple03(0);
		
		try {
			multiple03(0);
		}catch (RuntimeException re) {
			
		}
		
		try {
			multiple03(0);
		}catch(IndexOutOfBoundsException io){
			
		}catch (RuntimeException io) {
			
		}
		
//		try {
//			multiple03(0);
//		}catch(RuntimeException | IndexOutOfBoundsException e) {
//			
//		}
		
		
	}

	

	/*
	 * 2 checked gleicher Hirarchiebaum
	 */
	public static void multiple01(int i) throws IOException, FileNotFoundException {
		if (i <= 0) {
			System.out.println("Fehler im I/O");
			throw new IOException();
		} else {
			System.out.println("Fehler in Datei");
			throw new FileNotFoundException();
		}
	}
	/*
	 * 2 checked
	 * ungleicher Hirarchiebaum
	 */
	public static void multiple01_2(int i) throws ClassNotFoundException, FileNotFoundException{
		if (i <= 0) {
			System.out.println("Klasse nicht gefunden");
			throw new ClassNotFoundException();
		} else {
			System.out.println("Fehler in Datei");
			throw new FileNotFoundException();
		}
	}
	/*
	 * 1 checked, 1 unchecked
	 */
	public static void multiple02(int i) throws RuntimeException, IOException{
		if (i <= 0) {
			System.out.println("Fehler im I/O");
			throw new IOException();
		} else {
			System.out.println("Laufzeitfehler");
			throw new RuntimeException();
		}
	}
	/*
	 * 2 unchecked
	 * gleicher Hirarchiebaum
	 */
	public static void multiple03(int i) throws RuntimeException, IndexOutOfBoundsException {
		if (i <= 0) {
			System.out.println("Indexfehler");
			throw new IndexOutOfBoundsException();
		} else {
			System.out.println("Laufzeitfehler");
			throw new RuntimeException();
		}
		
	}
}
