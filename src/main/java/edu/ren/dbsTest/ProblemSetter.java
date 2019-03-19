package edu.ren.dbsTest;

import java.util.HashSet;
import java.util.Set;

public class ProblemSetter implements Department {
    Set<String> names;
    static String dept="ProblemSetter";

    public ProblemSetter() {
        this.names = new HashSet<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String s: names) {
            sb.append(s).append(',');
        }
        return  dept +"\n" +
                "Name : " + sb.toString();
    }

    @Override
    public void setName(String name) {
        names.add(name);
    }

    @Override
    public String display() {
        StringBuilder sb = new StringBuilder();
        for (String s: names) {
            sb.append(s);
        }
        return sb.toString();
    }
}
