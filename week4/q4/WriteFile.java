package q4;

import java.io.*;

public class WriteFile {
  public static void main(String[] args) {
    String data= "Data to be written in the file";
    try{
      FileWriter newFile = new FileWriter("file1.txt");
      BufferedWriter output= new BufferedWriter(newFile);

      output.write(data);
      output.close();
    }
    catch(IOException e){
      System.out.println("Some error occurred");
      System.out.println(e);
    }
  }
}
