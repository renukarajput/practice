package edu.ren.comparison;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void test() {
        Map<Person, Integer> map = new TreeMap<>();
        Person h1 = new Person(1,"renuka");
        Person h2 = new Person(2,"rakesh");
        map.put(h1, 1);
        map.put(h2, 2);
        System.out.println("++ "+map.size());
        Set<Person> set = new TreeSet<>();
        set.add(new Person(1,"renuka"));
        set.add(new Person(2,"rakesh"));
        System.out.println("== "+ set.size());
    }
}