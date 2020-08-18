package demoFiles;

import java.io.File;
import java.io.IOException;

public class DemoFiles {

	public static void main(String[] args) {
		
		/*
		 * Ein File Objekt stellt eine Instanz auf 
		 * eine Datei oder ein Verzeichnis dar
		 */
		File file = new File("Readme.txt");
		File dir = new File("MeinNeuerOrdner");
		
		System.out.println("file.exists(): " + file.exists());
		System.out.println("file.isFile(): " + file.isFile());
		System.out.println("file.isDirectory(): " + file.isDirectory());
		System.out.println("-------------------------------------------");
		System.out.println("dir.exists(): " + dir.exists());
		System.out.println("dir.isFile(): " + dir.isFile());
		System.out.println("dir.isDirectory(): " + dir.isDirectory());
		
		dir.mkdir();
		System.out.println("-------------------------------------------");
		System.out.println("dir.exists(): " + dir.exists());
		System.out.println("dir.isFile(): " + dir.isFile());
		System.out.println("dir.isDirectory(): " + dir.isDirectory());
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("-------------------------------------------");
		System.out.println("file.exists(): " + file.exists());
		System.out.println("file.isFile(): " + file.isFile());
		System.out.println("file.isDirectory(): " + file.isDirectory());
		System.out.println("-------------------------------------------");
		
		File dir2 = new File("C:/TestOrdner/Unterordner");
		System.out.println("dir2.exists(): " + dir2.exists());
		dir2.mkdirs();
		System.out.println("dir2.exists(): " + dir2.exists());
		System.out.println("-------------------------------------------");
		
		File file2 = new File("MeinNeuerOrdner/Readme.txt");
		System.out.println("file2.exists(): " + file2.exists());
		System.out.println("file2.isFile(): " + file2.isFile());
		System.out.println("file2.isDirectory(): " + file2.isDirectory());
		System.out.println("-------------------------------------------");
				
		try {
			file2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("file2.exists(): " + file2.exists());
		System.out.println("file2.isFile(): " + file2.isFile());
		System.out.println("file2.isDirectory(): " + file2.isDirectory());
		System.out.println("-------------------------------------------");
		
		File dir3 = new File("../Test2");
		dir3.mkdir();
		System.out.println("dir3.exists(): " + dir3.exists());
		System.out.println("dir3.isFile(): " + dir3.isFile());
		System.out.println("dir3.isDirectory(): " + dir3.isDirectory());
		System.out.println("-------------------------------------------");
		
		File[] dateien = dir.listFiles();
		for(File f : dateien) {
			System.out.println(f.getName());
		}
		for(File f : File.listRoots()) {
			System.out.println("Laufwerk: " + f);
		}
		
		
		
	}
	
	
	
}
