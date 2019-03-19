package edu.ren.dbsTest;

import java.util.HashMap;
import java.util.Map;

public class DepartmentFactory {
    Map<String, Department> departmentMap = new HashMap<>();

    public Department getReference(String name) {
        Department department = departmentMap.get(name);
        if (department != null)
            return department;

        if (name.equals(ProblemSetter.dept)) {
            department = new ProblemSetter();
        }
        if (name.equals(Sales.dept)) {
            department = new Sales();
        }
        if (name.equals(Developer.dept)) {
            department = new Developer();
        }
        departmentMap.put(name, department);
        return department;
    }
}
