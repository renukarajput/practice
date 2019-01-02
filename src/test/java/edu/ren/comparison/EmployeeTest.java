package edu.ren.comparison;

import org.junit.Test;

import java.util.*;


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

    // comparison based on name comparator along with age comparison
    @Test
    public void testTreeMap() {
        NameComparator name = new NameComparator();
        Employee e1 = new Employee("renuka", 100, 24);
        Employee e2 = new Employee("nilesh", 900, 25);
        Employee e3 = new Employee("jayesh", 600, 27);
        Employee e4 = new Employee("renuka", 10, 24);
        Map<Employee, Integer> map = new TreeMap(name);
        map.put(e1, 1);
        map.put(e2, 1);
        map.put(e3, 1);
        map.put(e4, 2);
        System.out.println("Sorted name = " + map);

    }
}


