package edu.ren.corejava.immutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
    List<Teacher> teacherList;
    String name;

    public Student(List<Teacher> teacherList){
        //for loop ,new Teacher(Teacher teacher) or teacher.copyOf(teacher1)
        //list1 ,add new teacher objects
        this.teacherList = Collections.unmodifiableList(teacherList);
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "teacherList=" + teacherList +
                ", name='" + name + '\'' +
                '}';
    }
/*public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }*/
}
