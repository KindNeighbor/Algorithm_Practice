import java.util.*;
import java.io.*;

public class Main {
    int count = 0;
    ArrayList<Integer>[] a;
    boolean[] t;
    int[] b;

    public void dfs(int x){
        b[x] = ++count;
        for (int next : a[x]) {
            if (t[next]) continue;
            t[next] = true;
            dfs(next);
        }
    }

    public void Sol() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        a = new ArrayList[N+1];
        for (int i = 1; i <= N; i++) {
            a[i] = new ArrayList<>();
        }
        b = new int[N+1];
        t = new boolean[N+1];

        while(M-- > 0){
            st = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            a[u].add(v);
            a[v].add(u);
        }
        
        for (int i = 1; i <= N; i++) {
            Collections.sort(a[i]);
        }
        
        t[R] = true;
        dfs(R);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(b[i]).append("\n");
        }
        System.out.print(sb);
    }
    
     public static void main(String[] args) throws Exception {
        new Main().Sol();
    }
}