package class_test;
class StudentTest extends Student{
  StudentTest(){
    super();
  }
  public static void main(String[] args) {
    Student pranjal = new Student("Pranjal");
    pranjal.set_marks(77, 99, 80);
    pranjal.get_marks();

    Student anany = new Student("Anany");
    anany.set_marks(88 , 70, 50);
    anany.get_marks();

    Student ram= new Student("Ram");
    ram.set_marks(33, 1, 45);
    ram.get_marks();

    Student shyam = new Student("Shayam");
    shyam.set_marks(1, 2, 3);
    shyam.get_marks();

    Student sita = new Student("Sita");
    sita.set_marks(90, 100 , 89);
    sita.get_marks();

    System.out.println();
    System.out.println("Total number of students are "+ calculate_total());
    System.out.println("The average marks of students are of students are " + calculate_avg());

  }
}

class Student{
  int roll_no, marks1, marks2, marks3;
  String name, course;

  static int no_of_students=0;
  static int total_marks=0;
  Student(){

  }
  Student(String name){
    this.name= name;
    no_of_students++;
  }
  void set_marks(int marks1, int marks2, int marks3){
    this.marks1= marks1;
    this.marks2= marks2;
    this.marks3= marks3;
    total_marks= marks1+ marks2+ marks3;
  }

  void get_marks(){
    System.out.println("Marks of " + this.name + " are ");
    System.out.println(marks1 + "  " + marks2 + "  " + marks3);
  }

  static int calculate_total(){
    return no_of_students;
  }
  static int calculate_avg(){
    int avg= total_marks/no_of_students;
    return avg;
  }
  String calculate_grade(){
    if(marks1 + marks2+ marks3 < 33){
      return "FAIL";
    }
    else{
      return "PASS";
    }
  }


}