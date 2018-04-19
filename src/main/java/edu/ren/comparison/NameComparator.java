package edu.ren.comparison;

import java.util.Comparator;

/**
 * Created by rrn3194 on 4/11/18.
 */
public class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}
