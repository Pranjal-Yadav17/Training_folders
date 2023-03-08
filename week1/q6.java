import java.util.*;

public class q6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number ");
    int num1 = sc.nextInt();
    System.out.println("Enter second number ");
    int num2 = sc.nextInt();

    int result = multiply(num1, num2);
    System.out.println("Their product is " + result);
    sc.close();
  }

  static int multiply(int a, int b) {
    int result = a*b;
    return result;
  }
}
