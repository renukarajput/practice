package edu.ren.comparison;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("ren", 1000, 27);
        Employee e2 = new Employee("jane", 2000, 27);
        Employee e3 = new Employee("ren", 1000, 28);
        Employee e4 = new Employee("ren", 1000, 28);
        List<Employee> employeeList = Arrays.asList(e1, e2, e3, e4);
        test(employeeList);
        Set<Employee> treeSet = new TreeSet<>();
        treeSet.add(e1);
        treeSet.add(e2);
        treeSet.add(e3);
        treeSet.add(e4);
        System.out.println("TreeSet --> "+treeSet);

        Map<Employee, String> treeMap = new TreeMap<>();
        treeMap.put(e1,"pune");
        treeMap.put(e2,"mumbai");
        treeMap.put(e3,"chennai");
        treeMap.put(e4,"goa");
        System.out.println("TreeMap --> "+treeMap);

        Set<Employee> hashSet = new HashSet<>();
        hashSet.add(e1);
        hashSet.add(e2);
        hashSet.add(e3);
        // without providing own hashcode and equals this will simply add emp object in hashSet even if it is duplicate bcoz it's new object
        hashSet.add(e4);

        System.out.println("HashSet --> "+hashSet);

        Map<Employee, String> hashMap = new HashMap<>();
        hashMap.put(e1,"pune");
        hashMap.put(e2,"mumbai");
        hashMap.put(e3,"chennai");
        hashMap.put(e4,"goa");
        System.out.println("HashMap --> "+hashMap);
    }

    private static void test(List<Employee> employeeList) {
        //top salary by age
        employeeList.stream().collect(
                Collectors.groupingBy(
                        Employee::getAge,
                        Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
        employeeList.stream().filter(e -> e.age==27).mapToDouble(Employee::getSalary).average().getAsDouble();

    }

}
class Temp{
    public static void main(String[] args) {
        int[] arr = {3, 8, -10, 23, 19, -4, -14, 27};
        Arrays.sort(arr);
        System.out.println("**** sorted array = "+ Arrays.toString(arr) );
        new Temp().print(10);
        String s1 = "hello";
        String s2 = new String("hello");
        s2 = s2.intern();
        System.out.println(s1==s2);
    }
    public void print(Integer i) {
        System.out.println("Integer");
    }
    public void print(int i) {
        System.out.println("int");
    }
    public void print(long i) {
        System.out.println("long");
    }
}
