import java.util.HashMap;
import java.util.Scanner;


public class Frequency {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter string: ");
    String str= sc.nextLine();
    char[] ch= str.toCharArray();
    HashMap<Character, Integer> map=new HashMap<>();

    for(char c: ch){
      if(c== ' ') continue;
      if(map.containsKey(c)){
        map.put(c, map.get(c)+1);
      }
      else{
        map.put(c, 1);
      }
    }
    System.out.println("Frequency of given characters is: ");
    System.out.println(map);
    sc.close();
  }
}
