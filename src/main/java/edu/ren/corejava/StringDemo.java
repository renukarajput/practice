package edu.ren.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringDemo {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8};
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(arr));
        //list.forEach(i -> {
          //  if(i % 2==0) System.out.println(i);});

       // list.forEach(System.out::print);
        List<Integer> collect = list.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect.stream().reduce((a,b) -> a+b));
        /*String str="one";
        String str1="one";
        String str2=new String("one");
        String str3=str2.intern();
        System.out.println("str==str2 "+(str==str2));
        System.out.println("str ==str2  "+(str==str2));
        System.out.println("str1 == str3 "+(str1==str3));
        System.out.println("str2 == str3 "+(str3=="one"));*/

    }
}


class Parent{
    static void test(){

    }
}

class Child extends Parent{

    void testt(){
        test();
    }
}
