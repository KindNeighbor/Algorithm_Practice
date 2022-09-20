import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    private static int N,M;
    private static boolean[] visited;
    private static int[] parent;
    private static ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        visited = new boolean[N + 1];
        parent = new int[N + 1];

        for (int i = 0; i <= N + 1; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 1; i < N ; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.get(a).add(b);
            list.get(b).add(a);
        }
        bfs(1);
    }

    private static void bfs(int start) {
        Queue<Integer> qu = new LinkedList<>();
        qu.offer(start);
        visited[1] = true;
        parent[start] = 1;

        while (!qu.isEmpty()) {
            int c = qu.poll();
            for (int item : list.get(c)) {
                if (!visited[item]) {
                    visited[item] = true;
                    parent[item] = c;
                    qu.offer(item);
                }
            }
        }
        for (int i = 2; i < parent.length; i++) {
            System.out.println(parent[i]);
        }
    }
}