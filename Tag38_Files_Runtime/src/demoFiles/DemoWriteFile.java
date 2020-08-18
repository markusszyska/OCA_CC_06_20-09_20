package demoFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DemoWriteFile {
	public static void main(String[] args) {

//		demoBufferedWriter();
//		demoPrintWriter();
		demoPrintWriterAppend();
		
	}

	private static void demoPrintWriterAppend() {
		File file = new File("DemoPrintWriter.txt");
		try {
			FileWriter fw = new FileWriter(file, true);
			PrintWriter pw = new PrintWriter(fw);
			pw.append("append()");
			pw.println("Zum appenden brauchen wir ein FileWriter Objekt");
			pw.flush();
			pw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	private static void demoPrintWriter() {
		File file = new File("DemoPrintWriter.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			PrintWriter pw = new PrintWriter(file);
			pw.println("erste Zeile");
			pw.println("zweite Zeile");
			pw.println("dritte Zeile");
			pw.print("nur print, ");
			pw.print("zweiter print");
			pw.println(" der Zeilenumbruch von println() wird erst am Ende gemacht");
			
			pw.println("Niemals flush() und/oder close() vergessen");
			
			
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	private static void demoBufferedWriter() {
		File file = new File("DemoBufferedWriter.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}			
		}
		
		try {
			/*
			 * zweiter Parameter beim FileWriter auf true für append
			 * 
			 * Buffered Writer hat newLine() und bessere Performance
			 * 
			 * Der FileWriter wird benutzt um character files zu schreiben.
			 * Seine write() Methode erlaubt es charaters oder Strings in eine Datei zu schreiben.
			 * Üblicherweise packt man FileWriter Objekte in Objekte von höheren
			 * Writer Klassen ein, welche höhre Performance und flexiblere
			 * Methoden bieten um Daten zu schreiben.
			 * 
			 * Der Buffered Writer wird genutzt um z.B. FileWriter effizienter und einfacher 
			 * nutzbar zu machen. Verglichen mit FileWritern schreiben BufferedWriter größere 
			 * Mengen auf einmal.
			 * 
			 */
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("erste Zeile");
			bw.newLine();
			bw.write("zweite Zeile");
			bw.write(" ohne newLine()");
			
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
