package com.company;

import java.util.*;

class DijkstraAlgorithm {
    public static void dijkstra(int[][] graph, int source) {
        int numVertices = graph.length;
        int[] dist = new int[numVertices];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;
        boolean[] visited = new boolean[numVertices];
        PriorityQueue<Integer> pq = new PriorityQueue<>(numVertices, new Comparator<Integer>() {
            public int compare(Integer u, Integer v) {
                return dist[u] - dist[v];
            }
        });
        pq.offer(source);
        while (!pq.isEmpty()) {
            int u = pq.poll();
            visited[u] = true;
            for (int v = 0; v < numVertices; v++) {
                if (graph[u][v] != 0 && !visited[v]) {
                    int newDist = dist[u] + graph[u][v];
                    if (newDist < dist[v]) {
                        pq.remove(v);
                        dist[v] = newDist;
                        pq.offer(v);
                    }
                }
            }
        }
        System.out.println("Shortest distances from source:");
        for (int i = 0; i < numVertices; i++) {
            System.out.println(source + " to " + i + ": " + dist[i]);
        }
    }

    public static void main(String[] args) {
        int[][] graph = {{0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 4, 14, 10, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}};
        int source = 0;
        dijkstra(graph, source);
    }
}
