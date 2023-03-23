package q4;

import java.io.*;

public class ReadFile {
  public static void main(String[] args) {
  BufferedReader objReader = null;
  try {
   String strCurrentLine;

   objReader = new BufferedReader(new FileReader("D:\\training_folder\\week4\\file1.txt"));

   while ((strCurrentLine = objReader.readLine()) != null) {

    System.out.println(strCurrentLine);
   }

  } catch (IOException e) {

   e.printStackTrace();

  } 
}

}
