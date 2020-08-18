package imageReader;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageReader {
	public static void main(String[] args) {
		loadImage();
	}

	private static void loadImage() {
		try {
			BufferedImage originalImage = ImageIO.read(new File("testBild.jpg"));
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ImageIO.write(originalImage, "jpg", baos);
			byte[] imageInByte = baos.toByteArray();
			System.out.println(imageInByte.length);
			for(byte b : imageInByte)
				System.out.println(b);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
