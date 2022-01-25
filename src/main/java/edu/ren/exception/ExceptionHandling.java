package edu.ren.exception;

import java.io.IOException;

public class ExceptionHandling {
    public static void main(String args[]){
        Parent p=new Child();
        try {
            p.msg();
            int i = 5/0;
        } catch (Exception e) {
            e.printStackTrace();
        } /*catch (ArithmeticException e){
            System.out.println(e);
        }*/
        System.out.println("finished");
    }
}

class Parent{
    void msg() throws IOException {
        System.out.println("parent");
    }
}

class Child extends Parent{
    void msg() {
        System.out.println("TestExceptionChild");
    }
}
