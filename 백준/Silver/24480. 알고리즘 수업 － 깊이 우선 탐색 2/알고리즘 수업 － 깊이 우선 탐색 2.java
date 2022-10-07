import java.util.*;
import java.io.*;

public class Main {
    static int count;
    public static int[] visited;
    public static ArrayList<ArrayList<Integer>> a = new ArrayList<>();

    public static void dfs(int x){

        visited[x]=count;
        for(int i=0; i<a.get(x).size(); i++){
            int y = a.get(x).get(i);
            if(visited[y]==0){
                count++;
                dfs(y);
            }
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        for(int i=0; i<N+1; i++){
            a.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            a.get(u).add(v);
            a.get(v).add(u);
        }
        
        for(int i=0; i<a.size(); i++){
            Collections.sort(a.get(i), Collections.reverseOrder());
        }

        count = 1;
        visited = new int[N+1];
        dfs(R);
        for(int i=1; i<visited.length; i++){
           System.out.println(visited[i]);            
        }
    }
}