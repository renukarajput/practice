package edu.ren.multiThreading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by rrn3194 on 3/14/18.
 */
public class ConcurrentModificationDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String[] names = {"renuka", "rakesh", "neha", "smita", "rahul", "xyz", "def"};
        list.addAll(Arrays.asList(names));
//        unsafeIteration(list);
        safeIteration(list);
        System.out.println("================ "+ list.size());
        list.forEach(x-> System.out.print(x+"**"));
    }

    private static void unsafeIteration(List<String> list) {
        int count=0;
        for (String name:list){
            System.out.println(name);
            list.remove(count);
            list.set(count,name+"---1");
            count++;
        }
    }

    private static void safeIteration(List<String> list) {
        int count=0;
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
        System.out.println(iterator.next());
            iterator.remove();
//            count++;
        }
    }
}
