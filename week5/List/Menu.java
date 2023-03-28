import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
    
    while(true){
      System.out.println("Enter 1 --> to add element");
      System.out.println("Enter 2 --> to remove element");
      System.out.println("Enter 3 --> to display all elements");
      System.out.println("Enter 4 --> to exit");

      int n= sc.nextInt();

      if(n==1){
        System.out.println("Enter number: ");
        list.add(sc.nextInt());
      }

      else if(n==2){
        System.out.println("Enter index of number to be removedd");
        list.remove(sc.nextInt());
      }

      else if(n==3){
        System.out.println(list);
      }
      else if(n==4){
        break;
      }
      System.out.println(list);
    }
    sc.close();
  }
}
