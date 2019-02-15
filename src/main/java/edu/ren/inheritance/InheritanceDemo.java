package edu.ren.inheritance;

public class InheritanceDemo {

    public static void main(String[] args) {
        Vehicle bike = new Bike(); // run-time polymorphism
        Vehicle car = new Car(); // ^ acquired through inheritance ..(method overriding)
        bike.Start();

        Vehicle v1 = new Vehicle();
        v1.display("Renuka"); // static polymorphism (method overloading) acquired within same class
    }
}

class Vehicle {
    public void Start() {
        System.out.println("Start vehicle");
    }

    private void test(){
        System.out.println("test method vehicle");
    }
    // overloading
    public void display(String str) {
        System.out.println("str= " + str);
    }

    public void display(int i) {
        System.out.println("i = " + i);
    }

}
// overriding
class Bike extends Vehicle{
    @Override
    public void Start(){
        System.out.println("Start Bike");
    }

    private void test(){
        System.out.println("test method bike");
    }
}

class Car extends  Vehicle{
    @Override
    public void Start(){
        System.out.println("Start Car");
    }
}