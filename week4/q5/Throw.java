package q5;

public class Throw {
  static void fun() {
    try {
      throw new NullPointerException("demo");
    } catch (NullPointerException e) {
      System.out.println("Caught inside fun().");
      throw e; // rethrowing the exception
    }
  }

  public static void main(String args[]) {
    try {
      fun();
      System.out.println("Hello");
    } catch (NullPointerException e) {
      System.out.println("Caught in main.");
    }
  }
}
