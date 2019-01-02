package edu.ren.comparison;


/**
 * Created by rrn3194 on 9/22/17.
 */
public class Employee extends Human implements Comparable<Employee> {
    String name;
    Integer salary;
    Integer age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

//        if (!name.equals(employee.name)) return false;
//        return age.equals(employee.age);

        return !name.equals(employee.name) ? false : age.equals(employee.age);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age.hashCode();
        return result;
    }

    public Employee(String name, Integer salary, Integer age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String getSocialStatus() {
        return "employee";
    }

    public static String getOrigin() {
        return "employee-origin";
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    // comparison based on name & age of emp
    @Override
    public int compareTo(Employee emp) {
        int result = this.name.compareTo(emp.name);

//        return result == 0 ? (this.age.compareTo(emp.age)) : 1;

        return this.age.compareTo(emp.age);
/*      if (this.name.compareTo(emp.name) != 0) {
            return 1;
        } else {
            if (this.age.compareTo(emp.age) == 0) {
                return 0;
            } else {
                return 1;
            }
        }*/
//    return 0; if we return this then this'll consider the entry as true in any case
    }
}