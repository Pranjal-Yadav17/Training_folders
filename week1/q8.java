import java.util.*;

public class q8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number  ");
    int num1 = sc.nextInt();
    System.out.println("Enter first second  ");
    int num2 = sc.nextInt();
    System.out.println("Enter third number ");
    int num3 = sc.nextInt();

    int avg= (num1 + num2 + num3)/3;
    System.out.println("The average of given three numbers is "+ avg);

    sc.close();

  }
}
