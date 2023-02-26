package com.company;

import java.util.*;

public class BFS {
    private int V;
    private LinkedList<Integer> adj[];


    BFS(int v) {
        V = v;
        adj = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }


    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void bfs(int start) {
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int v = queue.poll();
            System.out.print(v + " ");

            Iterator<Integer> i = adj[v].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String args[]) {
        BFS g = new BFS(6);

        g.addEdge(0, 4);
        g.addEdge(0, 6);
        g.addEdge(1, 2);
        g.addEdge(2, 7);
        g.addEdge(2, 1);
        g.addEdge(3, 3);

        //System.out.println("BFS traversal starting from vertex 2:");
        g.bfs(2);
    }
}
