class Vehicle{
  void vehicle(){
    System.out.println("HI, I am a Vehicle!");
  }
}
class Car extends Vehicle{
  void car(){
  System.out.println("HI, I am a Car!");
  }
}

// Hierarchial inheritance
class Shape{
  void display(){
    System.out.println("Drawing Shape!");
  }
}
class Circle{
  void display(){
    System.out.println("Drawing Circle!");
  }
}
class Rectangle{
  void display(){
    System.out.println("Drawing Rectangle!");
  }
}
public static void main(String[] args){
  Vehicle v1 = new Vehicle();
  v1.vehicle();
  Car c1 = new Car();
  c1.car();
}

