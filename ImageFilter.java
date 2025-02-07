import org.code.theater.*;
import org.code.media.*;

public class ImageFilter extends ImagePlus {

  public ImageFilter(String fileName) {
    super(fileName);
  }

  // Add filter methods here
//Flips images horozontially 

 Pixel[][] pixels = getImagePixels(); {
    
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length / 2; col++) { 
        Pixel leftPixel = pixels[row][col];
        Pixel rightPixel = pixels[row][pixels[0].length - col - 1];
        leftPixel.setColor(rightPixel.getColor());      
      } 
    }
     
    }


  
}