package edu.ren.comparison;


/**
 * Created by rrn3194 on 9/22/17.
 */
public class Employee implements Comparable<Employee> {
   String name;
   Integer salary;
   Integer age;

    public Employee(String name, Integer salary, Integer age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Employee emp) {
        return this.name.compareTo(emp.name);
    }
}