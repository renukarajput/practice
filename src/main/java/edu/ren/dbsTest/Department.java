package edu.ren.dbsTest;

import java.util.Set;

public interface Department {
    void setName(String name);
    String display();
    Set<String> getNames();
}
