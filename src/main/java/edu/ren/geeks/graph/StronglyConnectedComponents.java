package edu.ren.geeks.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class StronglyConnectedComponents {

    void get(Graph graph) {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[graph.numberOfVertices];
        for (int i = 0; i <graph.numberOfVertices ; i++) {
            if(!visited[i])
            pushAfterNeighbous(graph,i,visited,stack);
        }
        Graph transpose = graph.getTranspose();
        Arrays.fill(visited,false);
        while (!stack.isEmpty()){
            Integer popped = stack.pop();
            if(!visited[popped]){
                transpose.dfs(popped,visited);
                System.out.println();
            }
        }
    }

    void pushAfterNeighbous(Graph graph, int startIndex, boolean[] visited, Stack<Integer> stack) {
        visited[startIndex] = true;
        LinkedList<Integer> nextVertices = graph.adjacencyList[startIndex];
        nextVertices.forEach(vertex -> {
            if(!visited[vertex])
            pushAfterNeighbous(graph, vertex, visited, stack);
        });
        stack.push(startIndex);
    }
}
