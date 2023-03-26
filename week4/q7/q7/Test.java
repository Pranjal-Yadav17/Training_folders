package q7;

import java.util.Scanner;

public class Test {

  public static void main(String[] args) {

    Operations op = new Operations();

    System.out.println("Enter 1 --> to add new employee");
    System.out.println("Enter 2 --> to check if an employee recored exists");
    System.out.println("Enter 3 --> to display information about that employee");
    System.out.println("Enter 4 --> to delete a specifuc file");
    System.out.println("Enter 5 --> to update details of an employee");
    System.out.println("Enter 6 --> to list details of all employees");

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (n == 1) {
      String empid, name, age, sal, dept;
      System.out.println("Enter employee id of the employee: ");
      empid = sc.next();
      System.out.println("Enter name of Employee: ");
      name = sc.next();
      System.out.println("Enter  age of Employee: ");
      age = sc.next();
      System.out.println("Enter salary of Employee: ");
      sal = sc.next();
      System.out.println("Enter department of Employee: ");
      dept = sc.next();

      op.addEmp(empid, name, age, sal, dept);

    } else if (n == 2) {
      System.out.println("Enter employee id of the employee");
      String empid = sc.next();
      if (op.file_exists(empid)) {
        System.out.println(empid + " records exist");
      } else {
        System.out.println(empid + " records do not exist");
      }
    }

    else if (n == 3) {
      System.out.println("Enter employee id of employee");
      String empid = sc.next();
      op.display(empid);
    } else if (n == 4) {
      System.out.println("Enter name of emoployee");
      String name = sc.next();
      op.deleteEmp(name);
    }
    else if(n==5){
      System.out.println("Enter employee id");
      String empid = sc.next();
      System.out.println("Enter detail to be replaced");
      String search= sc.next();
      System.out.println("Enter new detail");
      String replace = sc.next();
      
      op.replaceText(empid, search, replace);
      System.out.println("updated suceessfully");
    }
    else if(n==6){
      op.seeAll();
    }
    sc.close();
    // 1 --> adding emp
    // 2 --> if a particular emp exists
    // 3 --> displaying that emp
    // 4 --> delete an employee
    // 5 --> update info a an employee

  }
}
