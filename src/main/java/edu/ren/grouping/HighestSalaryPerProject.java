package edu.ren.grouping;

import java.util.*;

public class HighestSalaryPerProject {
// o/p : Adis Rahul 15000 ; Env  Rakesh 14000
//       Env  Rakesh 14000
//       Cloud Pooja  12000
    public void groupByProjectTitle(List<Employee> list) {
        Map<String, List<Employee>> projectToEmpMap = new HashMap();
        for (Employee e : list) {
            String projectTitle = e.getProjectName();
            if (!projectToEmpMap.containsKey(projectTitle)) {
                List<Employee> tempList = new ArrayList();
                tempList.add(e);
                projectToEmpMap.put(projectTitle, tempList);
            } else {
                List<Employee> employeeList = projectToEmpMap.get(projectTitle);
                employeeList.add(e);
            }
        }
        printHighestSalary(projectToEmpMap);
    }

    public void groupByProjectTitleOptimized(List<Employee> list) {
        Double maxSalary = Double.MIN_VALUE;
        Map<String, Employee> projectToEmpMap = new HashMap();
        for (Employee emp : list) {
            String projectTitle = emp.getProjectName();
            Double empSalary = emp.getSalary();
            if (empSalary > maxSalary) {
                maxSalary = empSalary;
                projectToEmpMap.put(projectTitle, emp);
            }
        }
        printHighestSalaryOptimized(projectToEmpMap);
    }

    private void printHighestSalaryOptimized(Map<String, Employee> projectToEmpMap) {
        System.out.println("***********");
        projectToEmpMap.forEach((k, v) -> System.out.println(k + "---> " + v.getName() + "-" + v.getSalary()));
    }

    private void printHighestSalary(Map<String, List<Employee>> projectToEmpMap) {
        String empName = "";
        String projectName = "";
        Set<Map.Entry<String, List<Employee>>> entries = projectToEmpMap.entrySet();
        Iterator<Map.Entry<String, List<Employee>>> itr = entries.iterator();
        while (itr.hasNext()) {
            Map.Entry<String, List<Employee>> next = itr.next();
            Double maxSalary = Double.MIN_VALUE;
            for (Employee emp : next.getValue()) {
                if (emp.getSalary() > maxSalary) {
                    maxSalary = emp.getSalary();
                    empName = emp.getName();
                    projectName = emp.getProjectName();
                }
            }
            System.out.println(projectName + "-> " + empName + " -> " + maxSalary);
        }
    }
}
