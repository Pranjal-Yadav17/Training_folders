import java.util.*;

public class q5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter divident ");
    int num1 = sc.nextInt();
    System.out.println("Enter divisor ");
    int num2 = sc.nextInt();
    
    int result = divide(num1, num2);
    System.out.println("The answer is " + result);
    sc.close();

  }

  static int divide(int divident, int divisor){
    int result= divident/divisor;
    return result;
  }
}
