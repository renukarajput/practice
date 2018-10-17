package edu.ren.comparison;

import java.util.*;

/**
 * Created by rrn3194 on 4/11/18.
 */
public class ComparatorTester {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("jim", 500, 26));
        employeeList.add(new Employee("john", 1000, 30));
        employeeList.add(new Employee("smith", 1500, 23));
        employeeList.add(new Employee("bravo", 1100, 34));

        Collections.sort(employeeList, new AgeComparator());
        Iterator<Employee> itr = employeeList.iterator();
        System.out.println("============ Sort employee by age ============= ");
        while (itr.hasNext()){
            Employee e = itr.next();
            System.out.println(e.toString());
        }
        Collections.sort(employeeList, new NameComparator());
        System.out.println("============ Sort employee by Name ===============");

        Iterator<Employee> itr1 = employeeList.iterator();
        while (itr1.hasNext()){
            Employee e = itr1.next();
            System.out.println(e.name+" "+ e.age + " "+ e.salary);
            e.toString();
        }

        for (Employee e:employeeList) {
            System.out.println(e.toString());
        }
        System.out.println("============ Sort student by age ========== ");

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("jim", 500, 26));
        studentList.add(new Student("john", 1000, 30));
        studentList.add(new Student("smith", 1500, 23));
        studentList.add(new Student("bravo", 1100, 34));

        Collections.sort(studentList);
        for (Student s:studentList) {
            System.out.println(s.toString());
        }
    }
}
