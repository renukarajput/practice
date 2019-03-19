package edu.ren.geeks.graph;


import edu.ren.datastructure.interviewBit.dynamicprogramming.Grid;

import java.util.LinkedList;

public class Graph {
    int numberOfVertices;
    LinkedList<Integer>[] adjacencyList;

    public Graph(int numberOfVertices) {
        this.numberOfVertices = numberOfVertices;
        adjacencyList=new LinkedList[numberOfVertices];
        for (int i = 0; i <numberOfVertices ; i++) {
            adjacencyList[i]=new LinkedList<>();
        }
    }

    void addEdge(int source,int destination){
        adjacencyList[source].add(destination);
    }

    public void dfs(){
        boolean[] visited=new boolean[numberOfVertices];
       dfs(0,visited);
    }

    void dfs(int source,boolean[] visited){
        if(visited[source]){
            return;
        }
        visited[source]=true;
        System.out.print(source+"->");
        LinkedList<Integer> nextVertices = adjacencyList[source];
        nextVertices.forEach(vertex->dfs(vertex,visited));
    }

    public Graph getTranspose(){
        Graph graph=new Graph(numberOfVertices);
        for (int i = 0; i <numberOfVertices ; i++) {
            LinkedList<Integer> nextVertices = adjacencyList[i];
            final int source=i;
            nextVertices.forEach(vertex->graph.adjacencyList[vertex].add(source));
        }
       return graph;
    }
}
