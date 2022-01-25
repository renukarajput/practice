package edu.ren.comparison;

import java.util.Comparator;

/**
 * Created by rrn3194 on 9/6/18.
 */
public class Labour extends Employee{

    public Labour(String name, Integer salary, Integer age) {
        super(name, salary, age);
    }

    @Override
    public String getSocialStatus() {
        return "labour";
    }

    public static String getOrigin() {
        return "labbour-origin";
    }
}