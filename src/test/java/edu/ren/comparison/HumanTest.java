package edu.ren.comparison;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by rrn3194 on 26/12/18.
 */
public class HumanTest {

    @Test
    public void testHashMap() {
        Map<Human, Integer> map = new HashMap<>();
        Human h1 = new Human("renuka");
        Human h2 = new Human("rakesh");
        map.put(h1, 1);
        map.put(h2, 2);
        Iterator<Human> itr = map.keySet().iterator();
        while (itr.hasNext())
            System.out.println("key === "+itr.next().name);
        System.out.println(map.size());
    }

}