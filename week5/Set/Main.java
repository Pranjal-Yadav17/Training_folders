import java.util.HashSet;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter size of array: ");
    int n= sc.nextInt();
    int[] nums= new int[n];

    HashSet<Integer> set = new HashSet<>();

    for(int i=0; i<n; i++){
      System.out.println("Enter element:");
      int number = sc.nextInt();
      nums[i]= number;
      set.add(number);
    }

    System.out.println("Enterd array:  ");
    System.out.print("[");
    for(int num: nums){
      System.out.print(num + " , ");
    }
    System.out.println("]");
    System.out.println("Unique element: ");
    System.out.print(set);
    sc.close();

  }
}
