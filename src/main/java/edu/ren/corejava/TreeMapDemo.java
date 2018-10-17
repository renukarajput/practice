package edu.ren.corejava;

import java.util.*;

public class TreeMapDemo {

    static class Person implements Comparable<TreeMapDemo.Person> {
        String name;
        Integer weight;

        @Override
        public int compareTo(Person o) {
            return this.name.compareTo(o.name);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Person person = (Person) o;

            return name.equals(person.name) && weight == person.weight;
        }

        @Override
        public int hashCode() {
            return name.hashCode();
        }

        public Person(String name, int weight) {
            this.name = name;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", weight=" + weight +
                    '}';
        }
    }

    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();
//        Set<Person> map = new TreeSet();
        Person p1 = new Person("ren", 50);
        Person p2 = new Person("abc", 40);
        Person p3 = new Person("ren", 55);

        /*map.put(p1, p2);
        map.put(p2, p1);
        Person prev = map.put(p3, p3);*/
        map.put(p1, "a");
        map.put(p2, "b");
        map.put(p3, "c");
        // System.out.println(prev);

        System.out.println(map);
    }
}

