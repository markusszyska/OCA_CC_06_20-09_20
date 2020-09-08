package projekt_Bildbearbeitung_AxelSchlewing;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.lang.Math;

public class Model  {

//	private int parameter;
//	private int rueckwerte;
	private BufferedImage bild2;
	
	
	public Model () {
		
	}
	
	public BufferedImage getBild2() {
		return bild2;
	}

	public void setBild2(BufferedImage bild2) {
		this.bild2 = bild2;
	}

	public void graustufen(BufferedImage bild1) {
		
		int bildhoehe = bild1.getHeight();
        int bildbreite = bild1.getWidth();
        int pixel;
        int blau,gruen,rot;
        int grauwertPixel;
        		      
        this.setBild2(new BufferedImage(bildbreite, bildhoehe, BufferedImage.TYPE_3BYTE_BGR));
        
        for (int j = 0; j < bildhoehe; j++)
        {
            for (int i = 0; i < bildbreite; i++)
                {
                   pixel = bild1.getRGB(i, j);
                   Color color = new Color(pixel, true);
                   blau = color.getBlue();
                   gruen = color.getGreen();
                   rot = color.getRed();
                   
                   grauwertPixel = (blau+gruen+rot)/3;
                   	                   
                   Color grau = new Color(grauwertPixel,grauwertPixel,grauwertPixel); 
                   int rgb = grau.getRGB();
                   bild2.setRGB(i, j, rgb);
                }
        }
         System.out.println("Graustufen berechnet");
	}

	
	
	public void weichzeichnen(BufferedImage bild1) {
		
		if (bild2 != null)	// falls berechnetes Bild schon vorhanden, dann dieses nochmal benutzen
			{
				bild1 = this.getBild2();
			}
		
		int bildhoehe = bild1.getHeight();
        int bildbreite = bild1.getWidth();
        int farbe;
        double blau, gruen, rot;
               
        this.setBild2(new BufferedImage(bildbreite, bildhoehe, BufferedImage.TYPE_3BYTE_BGR));
        
        int[][] blauKanal = new int[bildbreite][bildhoehe];
        int[][] rotKanal = new int[bildbreite][bildhoehe];
        int[][] gruenKanal = new int[bildbreite][bildhoehe];
        
        double[][] gauss_kern = { { 0.00022923296, 0.0059770769, 0.060597949}, {0.24173197, 0.38292751, 0.24173197}, {0.060597949, 0.0059770769, 0.00022923296}};
        
        for (int j = 1; j < bildhoehe-1; j++)
        	{
        	for (int i = 1; i < bildbreite-1; i++)
                {
                    farbe = bild1.getRGB(i, j);
                    Color color = new Color(farbe, true);
                    blau = color.getBlue();
                    gruen = color.getGreen();
                    rot = color.getRed();
                 
                    blauKanal[i][j] = (int) blau;
                    gruenKanal[i][j] = (int) gruen;                    
                    rotKanal[i][j] = (int) rot;
                }
        	}
            
        double faktor = 1;
        
        for (int i = 1; i < bildbreite - 1; i++) // iteriert durch das Bild
            {
                for (int j = 1; j < bildhoehe - 1; j++)
                     {
                		int summeBlau = 0;     // summeBlau entsteht aus den Produkten Pixeldaten * Koeffizienten
                		int summeGruen = 0;
                		int summeRot = 0;
                    
                		for (int ii = - 1; ii <= 1; ii++)       // iteriert spalten- und zeilenweise durch den Kern, ergibt Position für Koeffizienten im Kern
                        	{
                			for (int jj = - 1; jj <= 1; jj++)   //
                			
                				{
                 				double datablau = blauKanal[(i + ii)][(j +jj)];    // holt Farbwert für Blauanteil des Pixels an Pixelposition
                				double datagruen = gruenKanal[(i + ii)][(j +jj)];  // dito: für G
                				double datarot = rotKanal[(i + ii)][(j +jj)];      // dito: für R
                                double coeff = gauss_kern[(ii + 1)][(jj + 1)];                       
                                summeBlau += ((datablau * coeff)*faktor);          // summiert Produkt des Pixelfarbwertes für blau mit entsprechendem Koeffizient des Kerns und summiert
                                summeGruen += (int) ((datagruen * coeff)*faktor);  // dito: für G
                                summeRot += (int) ((datarot * coeff)*faktor);      // dito: für R
                 				}
                        	}
                      		Color farbe_neu = new Color(summeRot, summeGruen, summeBlau); 
                			int rgb = farbe_neu.getRGB();
                			bild2.setRGB(i, j, rgb);                   
                    }
            }
	}
	
public void kantendetektion(BufferedImage bild1) {
		
		if (bild2 != null)	// falls berechnetes Bild schon vorhanden, dann dieses nochmal benutzen
			{
				bild1 = this.getBild2();
			}
		
		int bildhoehe = bild1.getHeight();
        int bildbreite = bild1.getWidth();
        int farbe;
        double blau, gruen, rot;
               
        this.setBild2(new BufferedImage(bildbreite, bildhoehe, BufferedImage.TYPE_3BYTE_BGR));
        
        int[][] blauKanal = new int[bildbreite][bildhoehe];
        int[][] rotKanal = new int[bildbreite][bildhoehe];
        int[][] gruenKanal = new int[bildbreite][bildhoehe];
                        
     // Kern für Kantendetektion
        double[][] kanten_kern = {{-0.125,-0.125,-0.125},{-0.125,1,-0.125},{-0.125,-0.125,-0.125}};
                
        for (int j = 1; j < bildhoehe-1; j++)
        	{
        	for (int i = 1; i < bildbreite-1; i++)
                {
                    farbe = bild1.getRGB(i, j);
                    Color color = new Color(farbe, true);
                    blau = color.getBlue();
                    gruen = color.getGreen();
                    rot = color.getRed();
                 
                    blauKanal[i][j] = (int) blau;
                    gruenKanal[i][j] = (int) gruen;                    
                    rotKanal[i][j] = (int) rot;
                }
        	}
            
        double faktor = 1.1;
        
        for (int i = 1; i < bildbreite - 1; i++) // iteriert durch das Bild
            {
                for (int j = 1; j < bildhoehe - 1; j++)
                     {
                		int summeBlau = 0;     // summeBlau entsteht aus den Produkten Pixeldaten * Koeffizienten
                		int summeGruen = 0;
                		int summeRot = 0;
                    
                		for (int ii = - 1; ii <= 1; ii++)       // iteriert spalten- und zeilenweise durch den Kern, ergibt Position für Koeffizienten im Kern
                        	{
                			for (int jj = - 1; jj <= 1; jj++)   //
                			
                				{
                 				double datablau = blauKanal[(i + ii)][(j +jj)];    // holt Farbwert für Blauanteil des Pixels an Pixelposition
                				double datagruen = gruenKanal[(i + ii)][(j +jj)];  // dito: für G
                				double datarot = rotKanal[(i + ii)][(j +jj)];      // dito: für R
                                double coeff = kanten_kern[(ii + 1)][(jj + 1)];
                                summeBlau += (int)((datablau * coeff)*faktor);     // summiert Produkt des Pixelfarbwertes für blau mit entsprechendem Koeffizient des Kerns und summiert
                                summeGruen += (int) ((datagruen * coeff)*faktor);  // dito: für G
                                summeRot += (int) ((datarot * coeff)*faktor);      // dito: für R
                 				}
                        	}
                		
        		
                		Color farbe_neu = new Color(Math.abs(summeRot),Math.abs(summeGruen),Math.abs(summeBlau)); 
                			int rgb = farbe_neu.getRGB();
                			bild2.setRGB(i, j, rgb);                   
                    }
            }
	}

public void sobelfilter(BufferedImage bild1) {
	
	if (bild2 != null)	// falls berechnetes Bild schon vorhanden, dann dieses nochmal benutzen
		{
			bild1 = this.getBild2();
		}
	
	int bildhoehe = bild1.getHeight();
    int bildbreite = bild1.getWidth();
    int farbe;
    double blau, gruen, rot;
           
    this.setBild2(new BufferedImage(bildbreite, bildhoehe, BufferedImage.TYPE_3BYTE_BGR));
    
    int[][] blauKanal = new int[bildbreite][bildhoehe];
    int[][] rotKanal = new int[bildbreite][bildhoehe];
    int[][] gruenKanal = new int[bildbreite][bildhoehe];
                    
 // Kern für Sobelfilter in x- und y-Richtung
    double[][] sobelx_kern = {{-.1,0,.1},{-.1,0,.1},{-.1,0,.1}};   // typisches Sobel-Filter in x-Richtung
    double[][] sobely_kern = {{-.1,-.1,-.1},{0,0,0},{.1,.1,.1}};   // typisches Sobel-Filter in y-Richtung
        
    for (int j = 1; j < bildhoehe-1; j++)
    	{
    	for (int i = 1; i < bildbreite-1; i++)
            {
                farbe = bild1.getRGB(i, j);
                Color color = new Color(farbe, true);
                blau = color.getBlue();
                gruen = color.getGreen();
                rot = color.getRed();            
                blauKanal[i][j] = (int) blau;
                gruenKanal[i][j] = (int) gruen;                    
                rotKanal[i][j] = (int) rot;
            }
    	}
        
    double faktor = 1.7;
    
    // Faltung 
    for (int i = 1; i < bildbreite - 1; i++) // iteriert durch das Bild
        {
            for (int j = 1; j < bildhoehe - 1; j++)
                 {
            		int summeBlau = 0;     // summeBlau entsteht aus den Produkten Pixeldaten * Koeffizienten
            		int summeGruen = 0;
            		int summeRot = 0;
                
            		for (int ii = - 1; ii <= 1; ii++)       // iteriert spalten- und zeilenweise durch den Kern, ergibt Position für Koeffizienten im Kern
                    	{
            			for (int jj = - 1; jj <= 1; jj++)   //
            				{
             				double datablau = blauKanal[(i + ii)][(j +jj)];    // holt Farbwert für Blauanteil des Pixels an Pixelposition
            				double datagruen = gruenKanal[(i + ii)][(j +jj)];  // dito: für G
            				double datarot = rotKanal[(i + ii)][(j +jj)];      // dito: für R
                            double coeff1 = sobelx_kern[(ii + 1)][(jj + 1)];
                            double coeff2 = sobely_kern[(ii + 1)][(jj + 1)];
                            summeBlau += (int)((datablau * coeff1 + datablau * coeff2)*faktor);
                            summeGruen += (int)((datagruen * coeff1 + datagruen * coeff2)*faktor);
                            summeRot += (int)((datarot * coeff1 + datarot * coeff2)*faktor);
            				}
                    	}

            		Color farbe_neu = new Color (Math.abs(summeRot),Math.abs(summeGruen),Math.abs(summeBlau));
            		int rgb = farbe_neu.getRGB();
            			bild2.setRGB(i, j, rgb);                   
                }
        }
	}

public void invertieren(BufferedImage bild1) {
	
	if (bild2 != null)	// falls berechnetes Bild schon vorhanden, dann dieses nochmal benutzen
		{
			bild1 = this.getBild2();
		}
	
	int bildhoehe = bild1.getHeight();
    int bildbreite = bild1.getWidth();
    int farbe;
    double blau, gruen, rot;
           
    this.setBild2(new BufferedImage(bildbreite, bildhoehe, BufferedImage.TYPE_3BYTE_BGR));
    
    int[][] blauKanal = new int[bildbreite][bildhoehe];
    int[][] rotKanal = new int[bildbreite][bildhoehe];
    int[][] gruenKanal = new int[bildbreite][bildhoehe];
        
    for (int j = 1; j < bildhoehe-1; j++)
    	{
    	for (int i = 1; i < bildbreite-1; i++)
            {
                farbe = bild1.getRGB(i, j);
                Color color = new Color(farbe, true);
                blau = color.getBlue();
                gruen = color.getGreen();
                rot = color.getRed();
                blauKanal[i][j] = (int) blau;
                gruenKanal[i][j] = (int) gruen;                    
                rotKanal[i][j] = (int) rot;
            }
    	}
  
    // Invertieren 
    for (int i = 1; i < bildbreite - 1; i++) // iteriert durch das Bild
        {
            for (int j = 1; j < bildhoehe - 1; j++)
                 {
            				int datablau = blauKanal[i][j];    // holt Farbwert für Blauanteil des Pixels an Pixelposition
            				int datagruen = gruenKanal[i][j];  // dito: für G
            				int datarot = rotKanal[i][j];      // dito: für R
                            
                            blau = Math.abs(255-datablau);
                            gruen = Math.abs(255-datagruen);
                            rot = Math.abs(255-datarot);
                            
                            Color farbe_neu = new Color ((int)rot, (int)gruen, (int)blau);
                            int rgb = farbe_neu.getRGB();
                			bild2.setRGB(i, j, rgb);
                  }
               }
        }

public void kern(BufferedImage bild1) {
	if (bild2 != null)	// falls berechnetes Bild schon vorhanden, dann dieses nochmal benutzen
	{
		bild1 = this.getBild2();
	}

int bildhoehe = bild1.getHeight();
int bildbreite = bild1.getWidth();
int farbe;
double blau, gruen, rot;
       
this.setBild2(new BufferedImage(bildbreite, bildhoehe, BufferedImage.TYPE_3BYTE_BGR));

int[][] blauKanal = new int[bildbreite][bildhoehe];
int[][] rotKanal = new int[bildbreite][bildhoehe];
int[][] gruenKanal = new int[bildbreite][bildhoehe];
                
// Kern für Kantendetektion
double[][] kanten_kern = {{1,0, 0},{1,0,0},{1,0,0}};
        
for (int j = 1; j < bildhoehe-1; j++)
	{
	for (int i = 1; i < bildbreite-1; i++)
        {
            farbe = bild1.getRGB(i, j);
            Color color = new Color(farbe, true);
            blau = color.getBlue();
            gruen = color.getGreen();
            rot = color.getRed();
         
            blauKanal[i][j] = (int) blau;
            gruenKanal[i][j] = (int) gruen;                    
            rotKanal[i][j] = (int) rot;
        }
	}
    
double faktor = 0.2;

for (int i = 1; i < bildbreite - 1; i++) // iteriert durch das Bild
    {
        for (int j = 1; j < bildhoehe - 1; j++)
             {
        		int summeBlau = 0;     // summeBlau entsteht aus den Produkten Pixeldaten * Koeffizienten
        		int summeGruen = 0;
        		int summeRot = 0;
            
        		for (int ii = - 1; ii <= 1; ii++)       // iteriert spalten- und zeilenweise durch den Kern, ergibt Position für Koeffizienten im Kern
                	{
        			for (int jj = - 1; jj <= 1; jj++)   //
        			
        				{
         				double datablau = blauKanal[(i + ii)][(j +jj)];    // holt Farbwert für Blauanteil des Pixels an Pixelposition
        				double datagruen = gruenKanal[(i + ii)][(j +jj)];  // dito: für G
        				double datarot = rotKanal[(i + ii)][(j +jj)];      // dito: für R
                        double coeff = kanten_kern[(ii + 1)][(jj + 1)];
                        summeBlau += (int)((datablau * coeff)*faktor);     // summiert Produkt des Pixelfarbwertes für blau mit entsprechendem Koeffizient des Kerns und summiert
                        summeGruen += (int) ((datagruen * coeff)*faktor);  // dito: für G
                        summeRot += (int) ((datarot * coeff)*faktor);      // dito: für R
         				}
                	}
		
        		Color farbe_neu = new Color(Math.abs(summeRot),Math.abs(summeGruen),Math.abs(summeBlau)); 
        			int rgb = farbe_neu.getRGB();
        			bild2.setRGB(i, j, rgb);                   
            }
    	}
	}
	
}



