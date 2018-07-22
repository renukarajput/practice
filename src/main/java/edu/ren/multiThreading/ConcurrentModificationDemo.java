package edu.ren.multiThreading;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

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
        iterateMap();
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

    private static void iterateMap(){
        ConcurrentMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("renuka", 10);
        map.put("john", 20);
        map.put("smith", 5);
        map.put("dave", 30);
        map.put("xyz", 40);
        map.put("def", 50);
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

//       map.forEach((x,y)->{map.remove(x,y);});

        while (iterator.hasNext()){
            map.remove(iterator.next().getKey());
        }
        System.out.println("map size - "+ map.size());
    }
}
