package java8apis;

public class Temp implements A,B {

    public static void main(String[] args) {
        display();
    }

    static void display() {
       // System.out.println(a);
    }
}

interface A{
    int a = 10;
}

interface B{
    int a = 20;
}