package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
class Employee{
    String name;
    String city;
    Double salary;

    public Employee(String name, String city, Double salary) {
        this.name = name;
        this.city = city;
        this.salary = salary;
    }
}

public class Solution {

    public static void main(String[] args) {
//        String input = "hello world hello word";
        String input = "aaabcde";
        final Map<Object, Long> collect = input.chars().mapToObj(c -> c)
                .collect(Collectors.groupingBy(c->c, Collectors.counting()));
//        System.out.println(collect);

        Map<String , Long> map =  Arrays.stream(input.split(" ")).collect(
                Collectors.groupingBy(c -> c , Collectors.counting()));
//        map.forEach( (k, v) -> System.out.println(k + " : "+ v) );

        List<Employee> list = Arrays.asList(
                new Employee("abc","delhi",10000.0),
                new Employee("xyz","pune",20000.0),
                new Employee("def","delhi",20000.0)
        );
        final List<String> res = list.stream().filter(x -> x.city.equals("delhi")).map(x -> x.name).collect(Collectors.toList());
        System.out.println("res = "+ res);
        System.out.println(list.stream().filter(x -> x.city.equals("delhi")).mapToDouble(x -> x.salary).average());
        System.out.println(list.stream().filter(x -> x.city.equals("delhi")).mapToDouble(x -> x.salary).max());

    }


}
