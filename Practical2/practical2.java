
// Single Inheritance
class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

// Multilevel Inheritance
class Person {
    void showPerson() {
        System.out.println("I am a Person");
    }
}

class Employee extends Person {
    void showEmployee() {
        System.out.println("I am an Employee");
    }
}

class Manager extends Employee {
    void showManager() {
        System.out.println("I am a Manager");
    }
}

// Hierarchical Inheritance
class Shape {
    void display() {
        System.out.println("This is a Shape");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Area of Circle = " + (3.14 * 5 * 5));
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Area of Rectangle = " + (4 * 6));
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("Single Inheritance:");
        Car c = new Car();
        c.start();
        c.drive();

        System.out.println("\nMultilevel Inheritance:");
        Manager m = new Manager();
        m.showPerson();
        m.showEmployee();
        m.showManager();

        System.out.println("\nHierarchical Inheritance:");
        Circle cir = new Circle();
        cir.display();
        cir.area();

        Rectangle rect = new Rectangle();
        rect.display();
        rect.area();
    }
}
