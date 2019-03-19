package edu.ren.dbsTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//Sales ne#ha$
//Developer re#nu&ka$
//ProblemSetter ra$ke#s&h
public class DepartmentTest {
    public static void main(String[] args) throws IOException {
        DepartmentTest departmentTest = new DepartmentTest();
        Map<Department, Set<String>> map = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.trim().isEmpty()) break;

            String[] split = line.split(" ");

            String departmentName = split[0];
            String empName = departmentTest.removeSpecialCharacter(split[1]);

            Department dept = new DepartmentFactory().getReference(departmentName);
            dept.setName(empName);
            map.put(dept, dept.getNames());
            dept.display();
            System.out.println(dept.toString());
        }
        reader.close();
        System.out.println("done");
    }

    private String removeSpecialCharacter(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char charAt = input.charAt(i);
            if (Character.isLetter(charAt)) {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }
}
