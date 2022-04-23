package edu.ren.design.lrucache;

import org.junit.Test;

public class LRUCacheTest {

    @Test
    public void test_1() {
        LRUCache lRUCache = new LRUCache(2);
        int[][] keyValues = {{1, 1}, {2, 2}, {3, 3}};
        for (int[] pair : keyValues) {
            System.out.println(lRUCache.get(1));
            lRUCache.put(pair[0], pair[1]);
        }
        System.out.println(lRUCache.entrySet());
        System.out.println(lRUCache.entrySet());
        lRUCache.put(4, 4);
        System.out.println(lRUCache.entrySet());
        lRUCache.get(1);    // return -1 (not found)
        System.out.println(lRUCache.entrySet());
        lRUCache.get(3);    // return 3
        System.out.println(lRUCache.entrySet());
        lRUCache.get(4);
        System.out.println(lRUCache.entrySet());
    }

}