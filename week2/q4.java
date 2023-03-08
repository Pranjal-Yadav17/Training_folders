import java.util.Scanner;

public class q4 {
  public static void main(String[] args) {
    int a, b, c, largest;
   
    Scanner sc = new Scanner(System.in);

    // reading input from the user
    System.out.println("Enter the first number:");
    a = sc.nextInt();
    System.out.println("Enter the second number:");
    b = sc.nextInt();
    System.out.println("Enter the third number:");
    c = sc.nextInt();


    largest = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
    System.out.println("The largest number is: " + largest);

    sc.close();
  }
}