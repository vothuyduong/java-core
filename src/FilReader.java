import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilReader {

  public void readFile(String url) throws FileNotFoundException {
    File file = new File(url);
    BufferedReader reader = new BufferedReader(new FileReader(file));
    try {
      String line = reader.readLine();
      while(line != null) {
        System.out.println(line);
        line = reader.readLine();
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      try {
        reader.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
