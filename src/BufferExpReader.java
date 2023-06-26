import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferExpReader {

  public void readFile(String url) {
    FileInputStream fileInputStream = null;
    BufferedReader bufferReader = null;
    try {
      fileInputStream = new FileInputStream(url);
      bufferReader = new BufferedReader(new InputStreamReader(fileInputStream));
      String line = bufferReader.readLine();
      while(line != null) {
        System.out.println(line);
        line = bufferReader.readLine();
      }
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      try {
        bufferReader.close();
        fileInputStream.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
