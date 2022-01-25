package edu.ren.comparison;

public class Person implements Comparable<Person>{
    Integer id;
    String name;

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
