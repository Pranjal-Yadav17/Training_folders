package q2;

import java.util.ArrayList;

public class test {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    list.add(8);
    list.add(17);
    list.add(2001);
    list.add(10);
    list.remove(3);

    for(int i=0; i<list.size(); i++){
      System.out.println(list.get(i));
    }
  }
}
