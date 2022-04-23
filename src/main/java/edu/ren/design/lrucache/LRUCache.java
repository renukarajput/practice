package edu.ren.design.lrucache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    final int maxSize;
    int size;

    public LRUCache(int maxSize) {
        super(10,0.75f,true);
        this.maxSize = maxSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        if (size > maxSize) {
            size--;
            return true;
        }
        return false;
    }

    public V put(K key, V value) {
        size++;
        super.put(key, value);
        return value;
    }
}
