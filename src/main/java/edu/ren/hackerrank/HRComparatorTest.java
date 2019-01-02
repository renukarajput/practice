package edu.ren.hackerrank;


import java.util.*;

class Student implements Comparable<Student> {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Student s2) {
        int result = Double.compare(s2.getCgpa(), this.getCgpa());

        if (result == 0) {
            result = this.getFname().compareTo(s2.getFname());
        }
        if (result == 0) {
            result = Integer.compare(this.getId(), s2.getId());
        }
        return result;
    }
}


public class HRComparatorTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        Collections.sort(studentList);
//        Collections.sort(studentList,  Comparator.comparing(Student :: getCgpa).reversed().
//                thenComparing(Student :: getFname).thenComparing(Student :: getId));

        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}
