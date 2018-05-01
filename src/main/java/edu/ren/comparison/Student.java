package edu.ren.comparison;

/**
 * Created by rrn3194 on 4/11/18.
 */
public class Student implements Comparable<Student> {

    String name;
    Integer salary;
    Integer age;

    public Student(String name, Integer salary, Integer age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
