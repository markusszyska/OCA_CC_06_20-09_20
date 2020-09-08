package projekt_Bildbearbeitung_AxelSchlewing;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Controller {
	
	private View view;
	private Bild bild;
	private Model model;
	
	private BufferedImage bild1;
	private BufferedImage bild2;
	
		
	// Konstruktoren 
	public Controller () {
		this.setView(new View());
		this.setBild(new Bild());
		this.setModel(new Model());


		this.getView().addActionListenerToButtons(e -> {
			try {
					ButtonPanel(e);
				} 	
			
			catch (IOException ex1) {
					ex1.printStackTrace();
				}
			});
		}
		
	

	public View getView() {
		return view;
		}


	public void setView(View view) {
		this.view = view;
		}

	
	public Model getModel() {
		return model;
		}

	public void setModel(Model model) {
		this.model = model;
		} 

	
	public void dateiLaden() {
		
		JFileChooser chooser = new JFileChooser();			// JFileChooser-Objekt erstellen
		int rueckgabeWert = chooser.showOpenDialog(null);   // Dialog zum Oeffnen von Dateien anzeigen
                     
        if(rueckgabeWert == JFileChooser.APPROVE_OPTION) /* Abfrage, ob auf "Öffnen" geklickt wurde */
        {
             // Ausgabe der ausgewaehlten Datei
            String DateiName = chooser.getSelectedFile().getName();
        	System.out.println("Die zu öffnende Datei ist: \n" + DateiName);
                       		
        	    try {   
        	    	
        	    		BufferedImage originalImage = ImageIO.read(new File(chooser.getSelectedFile().getAbsolutePath()));
        	    	          	    	 
        	    	   	// Skalierung berechnen
        	    	   	int bildhoehe = originalImage.getHeight();
        				int bildbreite = originalImage.getWidth();
        				       				         				
        				double skal_x = (double) bildbreite/320;
        				double skal_y = (double) bildhoehe/320;
        				int breite = 0;
        				int hoehe = 0;
        				
        				
        				bild1 = originalImage;
        				
        				if (bildbreite > bildhoehe) {
        					breite = (int)(bildbreite/skal_x);  
        					hoehe = (int)(bildhoehe/skal_x);
        					System.out.println(bildbreite + " : " + bildhoehe);
        					System.out.println(breite + " : " + hoehe);
        					
        				}
        				
        				else
        					
        				{
        					breite = (int)(bildbreite/skal_y);  
        					hoehe = (int)(bildhoehe/skal_y);
        					System.out.println(bildbreite + " : " + bildhoehe);
        					System.out.println(breite + " : " + hoehe);
        					
        				}

    					Image newImage1 = bild1.getScaledInstance(320, 320, Image.SCALE_DEFAULT);
    						this.getView().getPanel_links().setBild(newImage1);
        	    	   	
        	    	   	Image newImage2 = bild1.getScaledInstance(320, 320, Image.SCALE_DEFAULT);
        	    	   		this.getView().getPanel_rechts().setBild(newImage2);
	       	    	
        	    	}
        	    
        	    catch (Exception ex) {
            			ex.printStackTrace();
            		
        	    	}
        }
   	}
	
	
	public void dateiSpeichern(BufferedImage bild2) {
	
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileFilter(new FileNameExtensionFilter("*.jpg", "jpg"));
      
		if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
			File file = fileChooser.getSelectedFile();
  
			try {
					BufferedImage image = bild2;
					ImageIO.write((BufferedImage) image, "jpg", new File(file.getAbsolutePath()));
            	}
        
			catch (IOException ex) {
					System.out.println("Failed to save image!");
			}
		}
		
		else 
			{
				System.out.println("No file choosen!");
			}
	}


	
	public void ButtonPanel(ActionEvent event) throws IOException {
	
		String button = event.getActionCommand();
		
		switch(button) {
		
					case ("Datei laden") :
						{
							this.dateiLaden();
							break;
						}
					
					case ("Datei speichern") :
						{
							System.out.println("Datei Speichern 1");
							if (this.getModel().getBild2() != null) {
								System.out.println("Datei Speichern 2");
								BufferedImage image = this.getModel().getBild2();
							this.dateiSpeichern(image);
							break;
						} 
						
						else
							break;
						
					}
					
					case ("Graustufen") : 
						{ 
							if (bild1 != null) {
							this.getModel().graustufen(bild1);
							bild2 = this.getModel().getBild2();
							Image newImage2 = bild2.getScaledInstance(200, 320, Image.SCALE_FAST);
							this.getView().getPanel_rechts().setBild(newImage2);
							break;}
								else
									break;
						}
					
					case ("Kantendetektion") :
						{
							if (bild1 != null) {
							this.getModel().kantendetektion(bild1);
							bild2 = this.getModel().getBild2();
							Image newImage2 = bild2.getScaledInstance(200, 320, Image.SCALE_FAST);
							this.getView().getPanel_rechts().setBild(newImage2);
							break;}
								else 
									break;
						}
					
									
					case ("Weichzeichnen") : 
						{	
							if (bild1 != null) {
							this.getModel().weichzeichnen(bild1);
							bild2 = this.getModel().getBild2();
							// System.out.println("Bild zurück an Controller : " + bild2.getHeight());
							Image newImage2 = bild2.getScaledInstance(200, 320, Image.SCALE_FAST);
							this.getView().getPanel_rechts().setBild(newImage2);
							break;}
								else
									break;
												}
				
					case ("Sobel Filter") : 
						{
							if (bild1 != null) {
							this.getModel().sobelfilter(bild1);
							bild2 = this.getModel().getBild2();
							Image newImage2 = bild2.getScaledInstance(200, 320, Image.SCALE_FAST);
							this.getView().getPanel_rechts().setBild(newImage2);
							break;
							}
								else
									break;
							}
				
					case ("Zurücksetzen") : 
						{
							if (bild1 != null) {
							this.getView().getPanel_rechts().setBild(bild1);
							break;
							}
								else
									break;
						}
			
					case ("Invertieren") :
					{
						if (bild1 != null) {
						this.getModel().invertieren(bild1);
						bild2 = this.getModel().getBild2();
						Image newImage2 = bild2.getScaledInstance(200, 320, Image.SCALE_FAST);
						this.getView().getPanel_rechts().setBild(newImage2);
						break;}
						else
							break;
						}
					
					
					case ("Kern"):
					{
						if (bild1 != null) {
							this.getModel().kern(bild1);
							bild2 = this.getModel().getBild2();
							Image newImage2 = bild2.getScaledInstance(200, 320, Image.SCALE_FAST);
							this.getView().getPanel_rechts().setBild(newImage2);
							break;}
							else
								break;
							}
					
					
					case ("ENDE"): 
						{	
							System.exit(0);		
									}
										
					default: break;
			}
		}
     
  

	public BufferedImage getBild1() {
		return bild1;
	}


	public void setBild1(BufferedImage bild1) {
		this.bild1 = bild1;
	}


	public Bild getBild() {
		return bild;
	}


	public void setBild(Bild bild) {
		this.bild = bild;
	}


	public BufferedImage getBild2() {
		return bild2;
	}


	public void setBild2(BufferedImage bild2) {
		this.bild2 = bild2;
	}

}
