package edu.ren.comparison;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class EmployeeTest {

    @Test // comparable natural ordering (by name)
    public void sortByName() {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("renuka", 100, 24));
        empList.add(new Employee("nilesh", 900, 25));
        empList.add(new Employee("jayesh", 600, 27));
        empList.add(new Employee("rakesh", 700, 29));
        empList.add(new Employee("yogesh", 150, 20));

        System.out.println(empList);
        Collections.sort(empList);
        System.out.println("Sorted list based on name = " + empList);
    }

    @Test // comparator
    public void sortByAge() {
        AgeComparator ageComparator = new AgeComparator();
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("renuka", 100, 24));
        empList.add(new Employee("nilesh", 900, 25));
        empList.add(new Employee("jayesh", 600, 27));
        empList.add(new Employee("rakesh", 700, 29));
        empList.add(new Employee("yogesh", 150, 20));

        Collections.sort(empList, ageComparator);
        System.out.println("Sorted list based on Age = " + empList);
    }

    @Test
    public void test() {
        Human[] empArr = new Employee[3];
        empArr[0] = new Employee("renuka", 100, 24);
        empArr[1] = new Employee("nilesh", 900, 25);
        empArr[2] = new Labour("jayesh", 600, 27);
        System.out.println("========");

        //Object x[] = new String[3];
        // x[0] = new Integer(0);

    }
}


