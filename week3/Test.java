class Account {
  int acc_no, phone_no;
  float balance;
  String name, dob;

  Account(String name, int acc_no, float balace){
    this.name= name;
    this.acc_no= acc_no;
    this.balance= balace;
  }

  void set_dob(String dob){
    this.dob= dob;
  }
  void set_phone_no(int phone_no){
    this.phone_no= phone_no;
  }
  void get_details(int acc_no){
    System.out.println("Name: "+ name);
    System.out.println("Phone number: " + phone_no);
    System.out.println("Date of birth: " + dob);
    System.out.println("Balance: " + balance);
  }
  void close_acc(Account acc_name){
    acc_name= null;
    //this object will be later deleted by garbage collector
  }

}

class SavingAccount extends Account{
  SavingAccount(String name, int acc_no, float balace) {
    super(name, acc_no, balace);
  }
  float fixed_deposit;
  void withdraw(double d){
    balance = (float) (balance- d);
    System.out.println("Current balance in "+ this.acc_no + " is: " + balance);
  }
  void deposite(double d){
    balance= (float) (balance+ d);
    System.out.println("Current balance in " + this.acc_no + " is: " + balance);
  }
  void fixed_deposit(int fixed_deposit){
    this.fixed_deposit= fixed_deposit;
  }
}

class LoanAccount extends Account{

  

  LoanAccount(String name, int acc_no, float balace) {
    super(name, acc_no, balace);
    
  }
  
  public void payEMI() {
    System.out.println("Pay EMI");
  }

  public void topUpLoan() {
    System.out.println("Top Up Loan");
  }

  public void repayment() {
    System.out.println("Re-Payment");
  }
  
}

public class Test{
  public static void main(String[] args) {
    SavingAccount sv= new SavingAccount("Pranjl", 11223, 10000);
    sv.set_dob("17th August, 2001");
    sv.set_phone_no(445566);
    sv.get_details(0);

    sv.withdraw(33.66);

    sv.deposite(990.9);
    
    

  }



}
