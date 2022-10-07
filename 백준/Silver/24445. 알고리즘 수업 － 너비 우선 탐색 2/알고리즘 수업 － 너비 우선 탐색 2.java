import java.io.*;
import java.util.*;

public class Main {
    public static int N,M,R;
    public static List<Integer> a[];
    public static boolean[] visited;
    public static int[] order;
    public static int count = 0;
    
    public static void bfs(int x) {
        Queue<Integer> q = new LinkedList<>();
        visited[x] = true;
        q.offer(x);
        
        while(!q.isEmpty()) {
            int num = q.poll();
            count++;
            order[num] = count;
            for(Integer i : a[num]) {
                if(!visited[i]) {
                    q.offer(i);
                    visited[i] = true;
                }
            }
        } 
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        
        a = new ArrayList[N+1];
        visited = new boolean[N+1];
        order = new int[N+1];
        
        for(int i = 0; i <= N; i++) {
            a[i] = new ArrayList<>();
        }
        
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int U = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());
            a[U].add(V);
            a[V].add(U);
        }
        
        for(int i = 1; i <= N; i++) {
            Collections.sort(a[i], Collections.reverseOrder());
        }
        
        bfs(R);

        for (int i = 1; i <= N; i++) {
            System.out.println(order[i]);
        }
    }
}