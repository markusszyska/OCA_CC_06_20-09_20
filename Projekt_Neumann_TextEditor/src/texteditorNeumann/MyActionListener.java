package texteditorNeumann;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.MessageFormat;

import javax.swing.JFileChooser;




public class MyActionListener extends Gui implements ActionListener, Icrypto{

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		if (s.equals("oeffnen")){
			JFileChooser j = new JFileChooser ("C: ");
			int r = j.showOpenDialog(null);
			
			if (r == JFileChooser.APPROVE_OPTION) {
				File file = new File(j.getSelectedFile().getAbsolutePath());
			try {
				//Strings s1 und sl werden definiert 
				String s1="", sl="";
			// fileReader 
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader (fr);
				sl = br.readLine();
				
				while ((s1=br.readLine())!= null) {
					sl= sl + "\n" + s1;
					
				txtArea.setText(sl);
				}}
				
				catch (Exception e1) {
					e1.printStackTrace();
				}
			
			}
			
		}
		else if (s.equals("speichern")) {
			JFileChooser j = new JFileChooser();
			int r = j.showSaveDialog(null);
			
			if (r == JFileChooser.APPROVE_OPTION) {
			
			File file =new File (j.getSelectedFile().getAbsolutePath());
			try {
				FileWriter wr = new FileWriter (file,false);
				BufferedWriter w = new BufferedWriter (wr);
				w.write(txtArea.getText());
				w.flush();
			}
			catch (Exception e2) {
				e2.printStackTrace();
			}
		}}
		
		else if (s.equals("drucken")) {
            MessageFormat header = new MessageFormat("");
            MessageFormat footer = new MessageFormat("");
            try {
                txtArea.print(header, footer);
            } catch (PrinterException ex) {
                ex.printStackTrace();
            }
        }

		
		
		
		
		
		
		
			else if (s.equals("loeschen")){
				 txtArea.setText(null);
				}
			else if (s.equals("Zeichen zaehlen")) {
				 int l =txtArea.getText().length();	
				txtArea.setText(txtArea.getText()+ "\n" + "Zeichenanzahl im Text: " + l);}
		
		
			else if (s.equals("Programm schliessen")) {
				System.exit(0);
			}
			else if (s.equals("einfache Verschluesselung")) {
				
				
				txtArea.setText(encrypte(txtArea));
			}
			else if (s.equals("doppelte Verschluesselung")) {
				txtArea.setText(encrypte(txtArea));
				txtArea.setText(encrypte2(txtArea));
			}
			else if (s.equals("einfache Entschluesselung")) {
				txtArea.setText(encrypte(txtArea));
			}
			else if (s.equals("doppelte Entschluesselung")) {
				txtArea.setText(encrypte2(txtArea));
				txtArea.setText(encrypte(txtArea));
			}
			else if (s.equals("bold")) {
			txtArea.setFont(new Font("Arial",Font.BOLD,20 ));
			}	
		
			else if (s.equals("italic")) {
				txtArea.setFont(new Font("Arial", Font.ITALIC,20));
			}
			else if (s.equals("Schrift groesser")) {
				txtArea.setFont(new Font("Arial", Font.PLAIN,30));
			}
			else if (s.equals("Schrift kleiner")) {
				txtArea.setFont(new Font("Arial", Font.PLAIN,10));
			}




	}

}
	

