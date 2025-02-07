import org.code.theater.*;
import org.code.media.*;

public class MyStory extends Scene {

  // Instance Variables
  private String[][] cultureText;
  private ImageFilter[][] cultureImage;
  
  // Constructor
  public MyStory(String[][] cultureText, ImageFilter[][] cultureImage) {
    this.cultureText = cultureText;
    this.cultureImage = cultureImage;
  }

  // Calls all the parts of your animation, in order
  public void drawScene() {
    drawExampleScene();
    
    drawFirstScene();
    drawSecondScene();
  }
    

//creates start scene 
  public void drawExampleScene() {
    // 1. clear the scene / draw background
   
clear("Teal");

    // 2. Set any style (text size, font, font style, fill color)
    
    setTextStyle(Font.MONO, FontStyle.BOLD_ITALIC);
    setTextColor("gold");

    // 3. Draw text and images, play sounds

    drawText("My country Ukraine",105,142);
 
    // 4. Pause before transitioning
    pause(2.0);


  }
//applies text to screen
  public void drawFirstScene() {
    clear("teal"); //color of backgrund
 
    drawText(cultureText[0][0], 50, 100);
    pause(0.5);
    drawText(cultureText[0][1], 250, 100);
    pause(0.5);
    drawText(cultureText[1][0], 50, 300);
    pause(0.5);
    drawText(cultureText[1][1], 250, 300);

    pause(1.0);
  }
//applies images to screen 
  public void drawSecondScene() {
    clear("teal"); //color of background

    drawImage(cultureImage[0][0], 0, 0, 200);
    pause(0.5);
    drawImage(cultureImage[0][1], 200, 0, 200);
    pause(0.5);
    drawImage(cultureImage[1][0], 0, 200, 200);
    pause(0.5);
    drawImage(cultureImage[1][1], 200, 200, 200);

    pause(1.0); //pauses to have time to read message 
  }

  

  // other methods
  
}