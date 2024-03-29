import java.util.*;

public class BFS {

    static class Graph {
        int V;
        LinkedList<Integer>[] adjList;

        Graph(int V) {
            this.V = V;
            adjList = new LinkedList[V];
            for (int i = 0; i < V; i++) {
                adjList[i] = new LinkedList<>();
            }
        }

        void addEdge(int v, int w) {
            adjList[v].add(w);
        }

        Set<Integer> bfs(int start) {
            Queue<Integer> queue = new LinkedList<>();
            Set<Integer> visited = new HashSet<>();
            queue.add(start);
            visited.add(start);
            while (!queue.isEmpty()) {
                int current = queue.poll();
                for (int neighbor : adjList[current]) {
                    if (!visited.contains(neighbor)) {
                        queue.add(neighbor);
                        visited.add(neighbor);
                    }
                }
            }
            return visited;
        }
    }

    public static void main(String[] args) {
        // Create a graph with 5 nodes and edges connecting them
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Perform BFS starting from node 0
        Set<Integer> visited = graph.bfs(0);
        System.out.println(visited);
    }
}
