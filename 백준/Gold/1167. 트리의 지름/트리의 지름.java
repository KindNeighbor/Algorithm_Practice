import java.io.*;
import java.util.*;

public class Main {

    static ArrayList<Node>[] list;
    static boolean[] check;
    static int startNode, max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int V = Integer.parseInt(br.readLine());
        list = new ArrayList[V + 1];
        check = new boolean[V + 1];

        for (int i = 1; i <= V; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < V; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int node = Integer.parseInt(st.nextToken());
            while (true) {
                int node2 = Integer.parseInt(st.nextToken());
                if (node2 == -1) break;

                int weight = Integer.parseInt(st.nextToken());
                list[node].add(new Node(node2, weight));
            }
        }

        max = 0;
        dfs(1, 0);
        check = new boolean[V + 1];
        max = 0;
        dfs(startNode, 0);
        System.out.println(max);
    }

    public static void dfs(int node, int weight) {
        if (check[node]) return;
        check[node] = true;

        if (weight > max) {
            max = weight;
            startNode = node;
        }

        for (Node n : list[node]) {
            if (!check[n.end]) {
                dfs(n.end, weight + n.weight);
            }
        }
    }
    
    static class Node {
        int end, weight;

        public Node(int end, int weight) {
            this.end = end;
            this.weight = weight;
        }
    }
}