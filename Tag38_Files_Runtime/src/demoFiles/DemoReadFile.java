package demoFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import javax.swing.JFrame;

public class DemoReadFile {
	public static void main(String[] args) {
//		demoBufferedReader();
		demoGetRessource();
	}

	private static void demoGetRessource() {
		StringBuilder text = new StringBuilder();
		try {
			InputStream in = DemoReadFile.class.getResourceAsStream("/DemoPrintWriter.txt");
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr);
			while(br.ready()) {
				text.append(br.readLine() + "\n");
			}
			System.out.println(text);					
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	private static void demoBufferedReader() {
		File file = new File("DemoPrintWriter.txt");
		StringBuilder text = new StringBuilder();
//		if(file.exists()) {
			try {
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);
				while(br.ready()) {
					text.append(br.readLine() + "\n");
				}
				System.out.println(text);				
			} catch (Exception e) {
				System.out.println("Datei nicht gefunden");
				e.printStackTrace();
			}			
//		}	
		System.out.println(file.exists());
		System.out.println("Programm beendet");
	}
}
