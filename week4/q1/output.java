import java.io.*;

public class output {
  public static void main(String args[]) {
    try {
      FileOutputStream fout = new FileOutputStream("testout.txt");
      String s = "Writing some text in the file";
      byte b[] = s.getBytes();// converting string into byte array
      fout.write(b);
      fout.close();
      System.out.println("success...");
    } catch (Exception e) {
      System.out.println("Some error occurred");
      System.out.println(e);
    }
  }

}
