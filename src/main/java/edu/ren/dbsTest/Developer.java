package edu.ren.dbsTest;

import java.util.HashSet;
import java.util.Set;

public class Developer implements Department {
    Set<String> names;

    public Set<String> getNames() {
        return names;
    }

    public Developer() {
        this.names = new HashSet<>();
    }

    static String dept = "Developer";

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String s : names) {
            sb.append(s);
        }
        return dept + "\n" +
                "Name : " + sb.toString();
    }

    @Override
    public void setName(String name) {
        names.add(name);
    }

    @Override
    public String display() {
        StringBuilder sb = new StringBuilder();
        for (String s : names) {
            sb.append(s);
        }
        return sb.toString();
    }
}
