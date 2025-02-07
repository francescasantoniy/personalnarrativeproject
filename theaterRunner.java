import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

    // 2D Array
    String[][] cultureText = {
      {"Flag", "Clothing"},
      {"Food", "myCity"}
    };

    ImageFilter[][] cultureImage = {
      { new ImageFilter("download-(5).jpeg"), new ImageFilter("LUB-Website-Vyshyvanka-images-1.png") },
      { new ImageFilter("l-intro-1646862866.jpg"), new ImageFilter("download-(4).jpeg") },
    };

    // MyStory object
    MyStory scene = new MyStory(cultureText, cultureImage);
    
    // Call drawScene
    scene.drawScene();
    
    // Play scene in Theater
    Theater.playScenes(scene);
    
  }
}
//for some reason it wouldnt let me put TheaterRuner.java so i just put theaterRunner.java