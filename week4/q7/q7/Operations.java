package q7;

import java.io.*;

public class Operations {
  public static void main(String[] args) {
    System.out.println("Main class of operations");
    //Operations o = new Operations();
  }

  public void addEmp(String empid, String name, String age, String salary, String dept) {
    try {
      FileWriter file = new FileWriter("D:\\training_folder\\week4\\q7\\q7\\Files\\" + empid + ".txt");
      BufferedWriter fw = new BufferedWriter(file);
      // 
      String data = "Emp id:" + empid + ", Name: " + name + ", Age: " + age + ", salary: " + ", Department: " + dept;

      fw.write(data);
      fw.close();

    } catch (IOException e) {
      System.out.println("exception during writing");
      System.out.println(e);
    }
  }

  public void display(String empid) {
    try {
      if (file_exists(empid)) {
        File file = new File("D:\\training_folder\\week4\\q7\\q7\\Files\\" + empid + ".txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        System.out.println("---------------------------------------------------------------------------------");
        while ((st = br.readLine()) != null)
          System.out.println(st);
        br.close();

        System.out.println("---------------------------------------------------------------------------------");
      }

    } catch (IOException e) {
      System.out.println("Exception in read block");
      System.out.println(e);
    }
  }

  public static boolean file_exists(String empid) {

    File f = new File("D:\\training_folder\\week4\\q7\\q7\\Files\\" + empid + ".txt");
    if (f.exists() == true)
      return true;
    return false;
  }

  public void deleteEmp(String empid) {
    try {
      File f = new File("D:\\training_folder\\week4\\q7\\q7\\Files\\" + empid + ".txt");
      if (f.delete()) {
        System.out.println(f.getName() + " deleted");
      } else {
        System.out.println("failed");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void replaceText(String empid, String search, String replace) {
    File log = new File("D:\\training_folder\\week4\\q7\\q7\\Files\\" + empid + ".txt");
    try {
      FileReader fr = new FileReader(log);
      String s;
      String totalStr = "";
      try (BufferedReader br = new BufferedReader(fr)) {
        while ((s = br.readLine()) != null) {
          totalStr += s;
        }
        totalStr = totalStr.replaceAll(search, replace);
        FileWriter fw = new FileWriter(log);
        fw.write(totalStr);
        fw.close();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void seeAll(){
    File folder = new File("D:\\training_folder\\week4\\q7\\q7\\Files\\");
    File[] files = folder.listFiles();
    // iterate the files array
    for (File file : files) {
      // check if the file
      if (file.isFile()) {

        //System.out.println("File - " + file.getName());
        displayTxt(file.getName());
      } else if (file.isDirectory()) {
        System.out.println("Folder - " + file.getName());
      }
    }
  }

  static public void displayTxt(String empid){
    try {
      File f= new File("D:\\training_folder\\week4\\q7\\q7\\Files\\" + empid );
      if(f.exists()){
        File file = new File("D:\\training_folder\\week4\\q7\\q7\\Files\\" + empid );
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        System.out.println("----------------------------------------------------");
        while ((st = br.readLine()) != null)
          System.out.println(st);
        br.close();

        System.out.println("----------------------------------------------------");
      }

    } catch (IOException e) {
      System.out.println("Exception in read block");
      System.out.println(e);
    }
  }
}
