import java.util.*;

public class q3 {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter first number  ");
      int num1= sc.nextInt();
      System.out.println("Enter second number  ");
      int num2= sc.nextInt();

      int result= sum(num1, num2);
      System.out.println("The sum of entered numbers is "+ result);
      sc.close();
    } 
    
    public static int sum(int a, int b){
      int result = a+b;
      return result;
    }
}
