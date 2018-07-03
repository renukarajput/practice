package javaPro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by rrn3194 on 6/12/18.
 */
public class ListFunctions {

    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("1","john"));
        list1.add(new Student("2","jeff"));
        list1.add(new Student("3","smith"));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("4","aasma"));
        list2.add(new Student("5","reshma"));
        list2.add(new Student("3","jonny"));
        System.out.println("list1 = "+ list1 + "\n list2 = "+ list2);

       /* for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i).id.equals(list2.get(j).id)){
                    list1.remove(list1.get(i));
                    list1.add(list2.get(j));
                }
            }
            System.out.println("["+ list1.get(i).id+ "->"+list1.get(i).name+ "]");
        }*/

        list1.forEach(x->{list2.forEach(y->{if(y.id==x.id){x.name=y.name;}});});

        List<Student> list3 = list1.stream().filter(x->list2.stream().anyMatch(y->y.id==x.id)).collect(Collectors.toList());
        System.out.println("list3 = "+list3);
        System.out.println("list1 = "+list1);
    }

}

class Student {
    String id;
    String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
