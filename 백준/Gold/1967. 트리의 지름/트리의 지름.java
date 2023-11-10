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

        for (int i = 0; i <= V; i++) {
            list[i] = new ArrayList<>();
        }

        StringTokenizer st;
        for (int i = 0; i < V - 1; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            
            list[node1].add(new Node(node2, weight));
            list[node2].add(new Node(node1, weight));
        }

        check = new boolean[V + 1];
        check[1] = true;
        dfs(1, 0);
        
        
        check = new boolean[V + 1];
        check[startNode] = true;
        dfs(startNode, 0);
        System.out.println(max);
    }

    public static void dfs(int node, int weight) {

        if (weight > max) {
            max = weight;
            startNode = node;
        }

        for (Node n : list[node]) {
            if (!check[n.end]) {
                check[n.end] = true;
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