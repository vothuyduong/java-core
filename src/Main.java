import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    String url = "C:\\Users\\GiGa\\Documents\\text.txt";
    Scanner scan = new Scanner(System.in);
    boolean stop = false;
    do {
      System.out.println("==============MENU================");
      System.out.println("1. Đọc file bằng Scanner.");
      System.out.println("2. Đọc file bằng BufferedReader.");
      System.out.println("3. Đọc file bằng FileReader.");
      System.out.println("4. Ghi file bằng BufferedWriter.");
      System.out.println("5. Thoát!");
      System.out.println("==================================");
      System.out.println("Hãy chọn 1 option: ");
      int choose = scan.nextInt();
      switch (choose) {
        case 1: {
          ScannerRead scannerRead = new ScannerRead();
          scannerRead.readFile(url);
          stop = false;
          break;
        }
        case 2: {
          BufferExpReader bufferExpReader = new BufferExpReader();
          bufferExpReader.readFile(url);
          stop = false;
          break;
        }
        case 3: {
          FilReader fileReader = new FilReader();
          fileReader.readFile(url);
          stop = false;
          break;
        }
        case 4: {
          BufferExpWritter bufferExpWritter = new BufferExpWritter();
          bufferExpWritter.writerFile(url);
          stop = false;
          break;
        }
        case 5: {
          stop = true;
          break;
        }
      }
    } while (stop == false);
  }
}