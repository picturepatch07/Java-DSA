package com.company;

import java.util.*;

class PrimsAlgorithm {
    public static void primMST(int[][] graph) {
        int n = graph.length;

        int[] parent = new int[n];
        int[] weight = new int[n];
        boolean[] visited = new boolean[n];


        Arrays.fill(weight, Integer.MAX_VALUE);
        Arrays.fill(parent, -1);
        weight[0] = 0;
        for (int i = 0; i < n; i++) {
            int minVertex = -1;
            for (int j = 0; j < n; j++) {
                if (!visited[j] && (minVertex == -1 || weight[j] < weight[minVertex])) {
                    minVertex = j;
                }
            }

            visited[minVertex] = true;
            for (int j = 0; j < n; j++) {
                if (graph[minVertex][j] != 0 && !visited[j] && graph[minVertex][j] < weight[j]) {
                    weight[j] = graph[minVertex][j];
                    parent[j] = minVertex;
                }
            }
        }

        System.out.println("Edge   Weight");
        for (int i = 1; i < n; i++) {
            System.out.println(parent[i] + " - " + i + "    " + graph[i][parent[i]]);
        }
    }

    public static void main(String[] args) {
        int[][] graph = {{0, 2, 0, 6, 0},
                {2, 0, 3, 8, 5},
                {0, 3, 0, 0, 7},
                {6, 8, 0, 0, 9},
                {0, 5, 7, 9, 0}};

        primMST(graph);
    }
}
