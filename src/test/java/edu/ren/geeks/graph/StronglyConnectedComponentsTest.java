package edu.ren.geeks.graph;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static org.junit.Assert.*;

public class StronglyConnectedComponentsTest {
    StronglyConnectedComponents stronglyConnectedComponents=new StronglyConnectedComponents();
    @Test
    public void get() {
        Graph g=new Graph(5);
        g.addEdge(1, 0);
        g.addEdge(0, 2);
        g.addEdge(2, 1);
        g.addEdge(0, 3);
        g.addEdge(3, 4);
        stronglyConnectedComponents.get(g);
    }

    @Test
    public void get2(){
    int i=8;
    int count =i&1;
        System.out.println(count);
    }
}