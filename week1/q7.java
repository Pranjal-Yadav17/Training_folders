import java.util.*;

public class q7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number  ");
    int num1 = sc.nextInt();
    System.out.println("Enter second number  ");
    int num2 = sc.nextInt();

    System.out.println("The sum of numbers is "+ sum(num1, num2));
    System.out.println("The difference of numbers is " + sub(num1, num2));
    System.out.println("The product of numbers is " + multiply(num1, num2));
    System.out.println("The division of numbers is " + divide(num1, num2));
    System.out.println("The modulus of numbers is " + rem(num1, num2));

    sc.close();
  }
  
  static int sub(int a, int b){
    return a-b;
  }
  static int sum(int a, int b) {
    int result = a + b;
    return result;
  }
  static int divide(int divident, int divisor){
    int result= divident/divisor;
    return result;
  }

  static int multiply(int a, int b) {
    int result = a * b;
    return result;
  }

  static int rem(int a, int b){
    return a%b;
  }
}
