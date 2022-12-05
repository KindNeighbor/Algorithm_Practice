import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int N,K;
    static boolean[] visited;
    static int time = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        visited = new boolean[100001];

        if (N == K) {
            System.out.println(0);
        } else {
            bfs();
            System.out.println(time);
        }
    }

    public static void bfs() {
        Queue<Var> pq = new LinkedList<>();
        pq.offer(new Var(N, 0));
        visited[N] = true;

        while (!pq.isEmpty()) {
            Var var = pq.poll();

            if (var.idx == K) {
                time = Math.min(time, var.time);
            }

            if (var.idx * 2 <= 100000 && !visited[var.idx * 2]) {
                visited[var.idx * 2] = true;
                pq.offer(new Var(var.idx * 2, var.time));
            }
            
            if (var.idx - 1 >= 0 && !visited[var.idx - 1]) {
                visited[var.idx - 1] = true;
                pq.offer(new Var(var.idx - 1, var.time + 1));
            }

            if (var.idx + 1 <= 100000 && !visited[var.idx + 1]) {
                visited[var.idx + 1] = true;
                pq.offer(new Var(var.idx + 1, var.time + 1));
            }


        }
    }

    public static class Var {
        int idx;
        int time;

        public Var(int idx, int time) {
            this.idx = idx;
            this.time = time;
        }
    }
}