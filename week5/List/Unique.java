import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Unique{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter 1 --> to add elemet");
    System.out.println("Enter 2 --> to exit");

    ArrayList<Integer> list = new ArrayList<>();

    while(true){
      System.out.println("Enter option: ");
      int n= sc.nextInt();
      if(n==1){
        System.out.println("Enter number: ");
        list.add(sc.nextInt());
      }

      else if(n==2){
        break;
      }
      else{
        System.out.println("Unidetified option");
      }
    }
    driver(list);
    
  }

  static public void driver(ArrayList<Integer> list){
    HashSet<Integer> set = new HashSet<>();
    int n= list.size();
    for(int i=0; i<n; i++){
      set.add(list.get(i));
    }
    System.out.println("Entered element --> " + list);
    System.out.println("Output --> " +set);
  }
}