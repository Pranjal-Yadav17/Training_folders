package q7;
import java.io.*;
import java.util.*;

public class Main {

  public static String filename="database.txt";

  public static void craeteNewFileMethod(){
    File database = new File(filename);

    try{
      if(database.createNewFile() == true){
        //createNewFile : returns boolean data type representing whether the new file is created or not
        try{
          FileWriter writer= new FileWriter(filename);
          writer.append("User ID"+","+"User Name"+","+","+"Job"+","+"Address");
          writer.append("\n");
          writer.close();
          System.out.println("File created successfully");
        }catch(IOException e){
          System.out.println("write inner try-catch block");
          System.out.println(e);
        }
      }
    }catch(IOException e){
      System.out.println("write outer try-catch block");
      System.out.println(e);
    }
  }

  public static void addPerson(Scanner input){
    
  }

  public static void main(String[] args) {
    
  }
}
