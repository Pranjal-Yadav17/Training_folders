import java.util.*;

public class q1 {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    double principal, rate, time, simple_intr, compound_intr;
    System.out.println("Enter principal amount: ");
    principal= sc.nextDouble();
    System.out.println("Enter rate of interest: ");
    rate= sc.nextDouble();
    System.out.println("Enter time: ");
    time= sc.nextDouble();
    
    //SI
    simple_intr = (principal * rate * time)/100;
    //CI
    compound_intr= principal * Math.pow(1.0 + rate/100.0, time) -principal;

    System.out.println("Simple interest: "+ simple_intr);
    System.out.println("Compound interest: "+ compound_intr);

    sc.close();

  }
}
