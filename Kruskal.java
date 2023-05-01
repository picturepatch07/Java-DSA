package com.company;

import java.util.*;

class KruskalMST {
    static int find(int[] parent, int i) {
        if (parent[i] == i) {
            return i;
        }
        return find(parent, parent[i]);
    }

    static void union(int[] parent, int[] rank, int x, int y) {
        int xroot = find(parent, x);
        int yroot = find(parent, y);

        if (rank[xroot] < rank[yroot]) {
            parent[xroot] = yroot;
        } else if (rank[xroot] > rank[yroot]) {
            parent[yroot] = xroot;
        } else {
            parent[yroot] = xroot;
            rank[xroot]++;
        }
    }

    static void kruskalMST(int[][] graph) {
        int V = graph.length;
        int[] parent = new int[V];
        int[] rank = new int[V];

        for (int i = 0; i < V; i++) {
            parent[i] = i;
            rank[i] = 0;
        }

        ArrayList<int[]> edges = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            for (int j = i+1; j < V; j++) {
                if (graph[i][j] != 0) {
                    edges.add(new int[]{i, j, graph[i][j]});
                }
            }
        }

        Collections.sort(edges, (a, b) -> Integer.compare(a[2], b[2]));

        int[][] mst = new int[V-1][2];
        int i = 0, j = 0;

        while (i < V-1 && j < edges.size()) {
            int[] edge = edges.get(j++);
            int x = find(parent, edge[0]);
            int y = find(parent, edge[1]);
            if (x != y) {
                mst[i++] = new int[]{edge[0], edge[1]};
                union(parent, rank, x, y);
            }
        }

        System.out.println("Edges in the minimum spanning tree:");
        for (int[] edge : mst) {
            System.out.println(edge[0] + " - " + edge[1]);
        }
    }

    public static void main(String[] args) {
        int[][] graph = {{0, 2, 0, 6, 0},
                {2, 0, 3, 8, 5},
                {0, 3, 0, 0, 7},
                {6, 8, 0, 0, 9},
                {0, 5, 7, 9, 0}};
        kruskalMST(graph);
    }
}
