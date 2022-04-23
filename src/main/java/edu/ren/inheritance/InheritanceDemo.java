package edu.ren.inheritance;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InheritanceDemo {

    public static void main(String[] args) {
        Vehicle bike = new Bike(); // run-time polymorphism
        Vehicle car = new Car(); // ^ acquired through inheritance ..(method overriding)
        bike.Start();

        Vehicle v1 = new Vehicle();
        v1.display("Renuka"); // static polymorphism (method overloading) acquired within same class
        A a = new B();
        B a1 = (B) a;
        a.sum();
        Stream<String> l1 = Stream.of("renuka");
        Stream<String> l2 = Stream.of("renuka1");
        final Stream<String> stream = Stream.of(l1, l2).flatMap(Stream::distinct);
        System.out.println(stream.collect(Collectors.toList()));
//        B b = new B();
//        C c = new C();
//        c.m1();
//        System.out.println(c.a);
//        C c1 = null;
//        c1.m3();
    }
}

class C implements X, Y {
    int a = 30;

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    public static void m3() {
        System.out.println("m3");
    }
}

interface X {
    int a = 10;

    default void m1() {
        System.out.println("1");
    }
}

interface Y {
    int a = 20;

    default void m1() {
        System.out.println("2");
    }

    void m2();
}

class A {
    public void sum() {
        System.out.println("sum");
    }

    public void sub() {
        System.out.println("sub");
    }
}

class B extends A {
    public void mul() {
        System.out.println("mul");
    }

    public void div() {
        System.out.println("div");
    }
}

class Vehicle {
    public void Start() {
        System.out.println("Start vehicle");
    }

    private void test() {
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
class Bike extends Vehicle {
    @Override
    public void Start() {
        System.out.println("Start Bike");
    }

    private void test() {
        System.out.println("test method bike");
    }
}

class Car extends Vehicle {
    @Override
    public void Start() {
        System.out.println("Start Car");
    }
}