package q7;

import java.io.*;
import java.util.Scanner;

public class Test {
  public static void addEmp(String name, String age, String salary, String dept) {
    try {
      FileWriter file = new FileWriter(name + ".txt");
      BufferedWriter fw = new BufferedWriter(file);

      String data = name + "\n" + age + "\n" + salary + "\n" + dept;

      fw.write(data);
      fw.close();

    } catch (IOException e) {
      System.out.println("exception during writing");
      System.out.println(e);
    }
  }

  public static void display(String name) {
    try {
      if (file_exists(name)) {
        File file = new File(name + ".txt");
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

  public static boolean file_exists(String name) {

    File f = new File(name + ".txt");
    if (f.exists() == true)
      return true;
    return false;
  }

  public static void deleteEmp(String name) {
    try {
      File f = new File(name + ".txt");
      if (f.delete()) {
        System.out.println(f.getName() + " deleted");
      } else {
        System.out.println("failed");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  static void replaceText(String name, String search, String replace) {
    File log = new File(name + ".txt");
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

  /**
   * @param args
   */
  public static void main(String[] args) {

    System.out.println("Enter 1 --> to add new employee");
    System.out.println("Enter 2 --> to check if an employee recored exists");
    System.out.println("Enter 3 --> to display information about that employee");
    System.out.println("Enter 4 --> to delete a specifuc file");

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (n == 1) {
      String name, age, sal, dept;
      System.out.println("Enter name of Employee: ");
      name = sc.next();
      System.out.println("Enter  age of Employee: ");
      age = sc.next();
      System.out.println("Enter salary of Employee: ");
      sal = sc.next();
      System.out.println("Enter department of Employee: ");
      dept = sc.next();

      addEmp(name, age, sal, dept);

    } else if (n == 2) {
      System.out.println("Enter name of the employee");
      String name = sc.next();
      if (file_exists(name)) {
        System.out.println(name + " records exist");
      } else {
        System.out.println(name + " records do not exist");
      }
    }

    else if (n == 3) {
      System.out.println("Enter name of employee");
      String name = sc.next();
      display(name);
    } else if (n == 4) {
      System.out.println("Enter name of emoployee");
      String name = sc.next();
      deleteEmp(name);
    }
    sc.close();
    // 1 --> adding emp
    // 2 --> if a particular emp exists
    // 3 --> displaying that emp
    // 4 --> delete an employee

  }
}
