import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ScannerRead {

  public void readFile(String url) throws FileNotFoundException {
    FileInputStream fileInputStream = new FileInputStream(url);
    Scanner scanner = new Scanner(fileInputStream);
    try {
      while (scanner.hasNextLine()) {
        System.out.println(scanner.nextLine());
      }
    } finally {
      try {
        scanner.close();
        fileInputStream.close();
      } catch (IOException ex) {
        System.out.println(ex);
      }
    }
  }
}
