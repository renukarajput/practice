package edu.ren.dbsTest;

import java.util.*;

//Sales ne#ha$
//Developer re#nu&ka$
//ProblemSetter ra$ke#s&h
public class DepartmentTest {
    public static void main(String[] args) {
        DepartmentTest departmentTest = new DepartmentTest();
        Map<Department, Set<String>> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int i = Integer.parseInt(sc.nextLine());
        while (i-->0) {
            String line = sc.nextLine();
            if (line.trim().isEmpty()) break;
            String[] split = line.split(" ");
            String dept = departmentTest.getReference(split[0]);
            String name = departmentTest.removeSpecialCharacter(split[1]);
            switch (dept) {
                case "Sales":
                    Sales sales = new Sales();
                    sales.setName(name);
                    map.put(sales, sales.names);
                    System.out.println(sales.toString());
                    break;
                case "Developer":
                    Developer dev = new Developer();
                    dev.setName(name);
                    map.put(dev, dev.names);
                    dev.display();
                    System.out.println(dev.toString());
                    break;
                case "ProblemSetter":
                    ProblemSetter problemSetter = new ProblemSetter();
                    problemSetter.setName(name);
                    map.put(problemSetter, problemSetter.names);
                    problemSetter.display();
                    System.out.println(problemSetter.toString());
                    break;
            }
        }
        System.out.println();

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

    private String getReference(String name) {
        if (name.equals(ProblemSetter.dept)) {
            return ProblemSetter.dept;
        }
        if (name.equals(Sales.dept)) {
            return Sales.dept;
        }
        if (name.equals(Developer.dept)) {
            return Developer.dept;
        }
        return " ";
    }
}
