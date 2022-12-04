import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    static ArrayList<ArrayList<Node>> graph;
    static int INF = 200000000;
    static int[] dist;
    static boolean[] visited;
    static int N, E;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        int[][] data = new int[E][3];

        graph = new ArrayList<>();
        dist = new int[N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            data[i][0] = a;
            data[i][1] = b;
            data[i][2] = c;
        }


        for (int i = 0; i < N + 1; i++) {
            dist[i] = INF;
        }

        for (int i = 0; i < N + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < data.length; i++) {
            graph.get(data[i][0]).add(new Node(data[i][1], data[i][2]));
            graph.get(data[i][1]).add(new Node(data[i][0], data[i][2]));
        }

        st = new StringTokenizer(br.readLine());

        int v1 = Integer.parseInt(st.nextToken());
        int v2 = Integer.parseInt(st.nextToken());

        int case1 = 0;
        int case2 = 0;

        case1 += dijkstra(1, v1);
        case1 += dijkstra(v1, v2);
        case1 += dijkstra(v2, N);

        case2 += dijkstra(1, v2);
        case2 += dijkstra(v2, v1);
        case2 += dijkstra(v1, N);

        if(case1 >= INF && case2 >= INF) {
            System.out.println(-1);
        } else {
            System.out.println(Math.min(case1, case2));
        }
    }

    public static int dijkstra(int start, int end) {

        Arrays.fill(dist, INF);
        Arrays.fill(visited, false);

        dist[start] = 0;

        boolean[] visited = new boolean[N + 1];

        PriorityQueue<Node> q = new PriorityQueue<>((x, y) -> x.weight - y.weight);
        q.offer(new Node(start, 0));

        while (!q.isEmpty()) {
            Node curNode = q.poll();

            if (visited[curNode.to]) {
                continue;
            }

            visited[curNode.to] = true;

            for (int i = 0; i < graph.get(curNode.to).size(); i++) {
                Node adjNode = graph.get(curNode.to).get(i);

                if (!visited[adjNode.to] && dist[adjNode.to] > curNode.weight + adjNode.weight) {
                    dist[adjNode.to] = curNode.weight + adjNode.weight;
                    q.offer(new Node(adjNode.to, dist[adjNode.to]));
                }
            }
        }

        return dist[end];
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