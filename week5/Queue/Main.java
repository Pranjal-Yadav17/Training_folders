import java.util.*;

public class Main {
  static Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
    solve(q, k);
    int s = q.size() - k;
    while (s-- > 0) {
      int x = q.poll();
      q.add(x);
    }
    return q;
  }

  static void solve(Queue<Integer> q, int k) {
    if (k == 0)
      return;
    int e = q.poll();
    solve(q, k - 1);
    q.add(e);
  }

  // driver code
  public static void main(String[] args) {
    Queue<Integer> queue = new LinkedList<Integer>();
    Scanner sc =new  Scanner(System.in);
    System.out.println("Enter 1 --> to add elemet");
    System.out.println("Enter 2 --> to exit");

    while (true) {
      System.out.println("Enter option: ");
      int n = sc.nextInt();
      if (n == 1) {
        System.out.println("Enter number: ");
        queue.add(sc.nextInt());
      }

      else if (n == 2) {
        break;
      } else {
        System.out.println("Unidetified option");
      }
    }
    System.out.println();
    System.out.println("Entered elements: ");
    System.out.print(queue);

    System.out.println();
    System.out.println("Number of elements to be reversed: ");
    int k =sc.nextInt();

    queue = reverseFirstK(queue, k);
    // printing queue
    System.out.println("After reversing: ");
    System.out.print(queue);
  }
}
