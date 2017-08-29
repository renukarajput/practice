package com.scala.javaPro;


import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.a1);
        System.out.println(a.a2);
        a.m1();
        a.m2();
//        String s1 = "renuka";
//        s1.concat("rajput");
//        System.out.println(s1);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter string ");
        String s = sc.nextLine();
        System.out.println("S: "+s);
    }
}
