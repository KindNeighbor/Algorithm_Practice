import java.io.*;
import java.util.*;

public class Main {
    
    static boolean check[];
    static int[][] arr;
    static int N,M,V;
    static StringBuilder sb = new StringBuilder();
    
    public static void dfs(int x) {
        check[x] = true;
        sb.append(x + " ");
        
        for(int i=0; i<=N; i++) {
            if(arr[x][i] == 1 && check[i] == false)
            {
                dfs(i);
            }
        }
    }
    
    public static void bfs(int x) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(x);
        check[x] = true;
        
        while(q.isEmpty() == false) {
            x = q.poll();
            sb.append(x + " ");
            
            for(int i=1; i<=N; i++) {
                if(arr[x][i] == 1 && check[i] == false) {
                    q.add(i);
                    check[i] = true;
                }
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        
        arr = new int[N+1][N+1];
        check = new boolean[N+1];
        
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine()," ");
            
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            
            arr[u][v] = 1; 
            arr[v][u] = 1;
        }
       
        dfs(V);
        sb.append("\n");
        check = new boolean[N+1];
        bfs(V);
        System.out.println(sb);
    }
}
