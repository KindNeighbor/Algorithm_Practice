import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int V = Integer.parseInt(br.readLine());
        int E = (V * (V - 1)) / 2;
        
        double[] x_point = new double[V];
        double[] y_point = new double[V];
        ArrayList<Integer> aList = new ArrayList<>();
        ArrayList<Integer> bList = new ArrayList<>();
        ArrayList<Double> distance = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            x_point[i] = Double.parseDouble(st.nextToken());
            y_point[i] = Double.parseDouble(st.nextToken());
        }

        for (int i = 0; i < V; i++) {
            double x1 = x_point[i];
            double y1 = y_point[i];

            for (int j = i + 1; j < V; j++) {
                double x2 = x_point[j];
                double y2 = y_point[j];
                
                aList.add(i + 1);
                bList.add(j + 1);
                distance.add(cal(x1, y1, x2, y2));
            }
        }

        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        for (int i = 0; i <= V; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            int A = aList.get(i);
            int B = bList.get(i);
            double C = distance.get(i);
            graph.get(A).add(new Edge(B, C));
            graph.get(B).add(new Edge(A, C));
        }
        
        double result = prim(graph, V);
        System.out.println(result);
    }
    
    static double prim(ArrayList<ArrayList<Edge>> graph, int V) {
        boolean[] visited = new boolean[V + 1];
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        
        double totalWeight = 0;
        
        pq.add(new Edge(1, 0));
        
        while (!pq.isEmpty()) {
            Edge cur = pq.poll();
            int u = cur.dest;

            if (!visited[u]) {
                visited[u] = true;
                totalWeight += cur.weight;

                for (Edge edge : graph.get(u)) {
                    if (!visited[edge.dest]) {
                        pq.add(new Edge(edge.dest, edge.weight));
                    }
                }
            }
        }
        return totalWeight;
    }

    private static double cal(double x1, double y1, double x2, double y2) {

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}

class Edge implements Comparable<Edge> {
    int dest;
    double weight;

    public Edge(int dest, double weight) {
        this.dest = dest;
        this.weight = weight;
    }

    public int compareTo(Edge compareEdge) {
        return Double.compare(this.weight, compareEdge.weight);
    }
}
