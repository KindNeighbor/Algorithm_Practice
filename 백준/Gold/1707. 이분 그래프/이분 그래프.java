import java.io.*;
import java.util.*;

public class Main {
    
    static int v, e;
    static ArrayList<Integer>[] list;
    static int[] check;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int K = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            v = Integer.parseInt(st.nextToken());
            e = Integer.parseInt(st.nextToken());
            
            list = new ArrayList[v+1];
            for (int j = 0; j < v + 1; j++) {
                list[j] = new ArrayList<>();
            }
            
            for (int j = 0; j < e; j++) {
                st = new StringTokenizer(br.readLine());
                int a1 = Integer.parseInt(st.nextToken());
                int a2 = Integer.parseInt(st.nextToken());
                
                list[a1].add(a2);
                list[a2].add(a1);
            }
            
            check = new int[v+1];
            BFS(1);
        }
    }
    
    public static void BFS(int x) {
        Queue<Integer> qu = new LinkedList<>();
        
        for (int i = 1; i < v + 1; i++) {
            if (check[i] == 0) {
                check[i] = 1;
                qu.add(i);
            }
            
            while (!qu.isEmpty()) {
                int nx = qu.poll();
                
                for (int j = 0; j < list[nx].size(); j++) {
                    if (check[list[nx].get(j)] == check[nx]) {
                        System.out.println("NO");
                        return;
                    }
                    
                    if (check[list[nx].get(j)] == 0) {
                        qu.add(list[nx].get(j));
                        
                        if (check[nx] == 1) {
                            check[list[nx].get(j)] = 2;
                        } else {
                            check[list[nx].get(j)] = 1;
                        }
                    }
                }
            }
        }
        System.out.println("YES");
    }
}