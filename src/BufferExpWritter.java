import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferExpWritter {

  public void writerFile(String url) throws IOException {
    String str = "Thử xem them file sẽ như thế nào";
    BufferedWriter writer = new BufferedWriter(new FileWriter(url, true));
    writer.append('\n');
    writer.append(str);
    writer.close();
  }
}
