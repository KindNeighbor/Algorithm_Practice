import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        
         ArrayList<Edge>[] graph = new ArrayList[V + 1];
        for (int i = 1; i <= V; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            graph[A].add(new Edge(B, C));
            graph[B].add(new Edge(A, C));
        }

        int result = prim(graph, V);
        System.out.println(result);
    }

    static int prim(ArrayList<Edge>[] graph, int V) {
        boolean[] visited = new boolean[V + 1];
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>();
        
        int totalWeight = 0;

        priorityQueue.add(new Edge(1, 0));

        while (!priorityQueue.isEmpty()) {
            Edge current = priorityQueue.poll();
            int u = current.destination;

            if (!visited[u]) {
                visited[u] = true;
                totalWeight += current.weight;

                for (Edge edge : graph[u]) {
                    if (!visited[edge.destination]) {
                        priorityQueue.add(edge);
                    }
                }
            }
        }
        return totalWeight;
    } 
}

class Edge implements Comparable<Edge> {
    int destination, weight;

    public Edge(int destination, int weight) {
        this.destination = destination;
        this.weight = weight;
    }

    public int compareTo(Edge compareEdge) {
        return this.weight - compareEdge.weight;
    }
}