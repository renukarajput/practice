package edu.ren.corejava.immutable;

import java.util.ArrayList;
import java.util.List;

public class ImmutabilityDemo {

    public static void main(String[] args) {
        String[] teacherNames = {"jane", "john", "smith", "mark"};
        List<Teacher> teacherList = new ArrayList<>();
        int id = 0;
        for (String teacherName : teacherNames) {
            Teacher teacher = new Teacher(teacherName, id++);
            teacherList.add(teacher);
        }
        Student s1 = new Student(teacherList);
        System.out.println("s1 hashcode " +s1.hashCode());
        System.out.println("s1 = "+ s1);
        s1.getTeacherList().add(new Teacher("me", 1));
        System.out.println(s1.hashCode()+"s1 = "+ s1);

        System.out.println(s1.getTeacherList().get(0));
        System.out.println(s1.hashCode()+" s1 = "+ s1);
    }
}
