package edu.ren.comparison;

/**
 * Created by rrn3194 on 9/6/18.
 */
public class Human {
    String name;

    public Human() {
    }

    public Human(String name) {
        this.name = name;
    }

    public String getSocialStatus() {
        return "human";
    }

    public static String getOrigin() {
        return "unknown";
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
