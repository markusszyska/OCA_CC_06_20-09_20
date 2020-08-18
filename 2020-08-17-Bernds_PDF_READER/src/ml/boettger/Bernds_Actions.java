package ml.boettger;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class Bernds_Actions {
	public static void exitAction(ActionEvent e ) {
		System.exit(0);
	}
	
	public static void clickAction(ActionEvent e ) {
		System.out.println("Klick die 4.");;		
	}	
}
