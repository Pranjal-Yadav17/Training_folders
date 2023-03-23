package q6;

class MyException extends Exception{
  MyException(){
    System.out.println("Custom exception is thrown");
  }
}

public class TestException {
  public static void main(String[] args) {
    try{
      throw new MyException();
    }catch(Exception e){
      System.out.println("Caught exception");
    }

    System.out.println("Out of try-catch block");
  }
}
