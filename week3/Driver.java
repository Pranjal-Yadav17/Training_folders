abstract class Shape{
  int perimeter(){
    return 0;
  }
  int area(){
    return 0;
  }
}

class Rectangle extends Shape{
  int length, width;
  int perimeter(){
    int ans= (length+ width)*2;
    return ans;
  }
  int area(){
    int ans= length* width;
    return ans;
  }
}


class Circle{
  int radius;
  final double pi = 3.14159265359;
  double perimeter(){
    return 2 * pi * radius;
  }
  double area(){
    return pi* radius * radius;
  }
}

class Driver{
  public static void main(String[] args) {
    Rectangle rec= new Rectangle();
    rec.length= 30;
    rec.width= 10;
    System.out.println(rec.perimeter());
    System.out.println(rec.area());

    Circle c= new Circle();
    c.radius= 5;
    System.out.println(c.perimeter());
    System.out.println(c.area());
  }
}
