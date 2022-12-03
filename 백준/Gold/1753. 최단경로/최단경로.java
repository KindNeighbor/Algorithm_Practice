import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        int K = Integer.parseInt(br.readLine());

        int[][] data = new int[E][3];

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            data[i][0] = u;
            data[i][1] = v;
            data[i][2] = w;
        }

        dijkstra(V, data, K);
    }

    public static void dijkstra(int v, int[][] data, int start) {

        ArrayList<ArrayList<Node>> graph = new ArrayList<>();
        for (int i = 0; i < v + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < data.length; i++) {
            graph.get(data[i][0]).add(new Node(data[i][1], data[i][2]));
        }
        
        int[] dist = new int[v + 1];

        for (int i = 1; i < v + 1; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[start] = 0;
        
        boolean[] visited = new boolean[v + 1];
        
        for (int i = 0; i < v; i++) {
            int minDist = Integer.MAX_VALUE;
            int curIdx = 0;
            for (int j = 1; j < v + 1; j++) {
                if (!visited[j] && dist[j] < minDist) {
                    minDist = dist[j];
                    curIdx = j;
                }
            }

            visited[curIdx] = true;


            for (int j = 0; j < graph.get(curIdx).size(); j++) {
                Node adjNode = graph.get(curIdx).get(j);
                
                if (dist[adjNode.to] > dist[curIdx] + adjNode.weight) {
                    dist[adjNode.to] = dist[curIdx] + adjNode.weight;
                }
            }
        }
        
        for (int i = 1; i < v + 1; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                System.out.println("INF ");
            } else {
                System.out.println(dist[i]);
            }
        }
    }

    static class Node {
        int to;
        int weight;

        Node(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }
}