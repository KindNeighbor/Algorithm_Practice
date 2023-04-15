import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i <= N; i++) {
            list.add(i);
        }
        
        
        for (int v = 0; v < M; v++) {
            st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            
            Deque<Integer> dq = new ArrayDeque<>();
            
            for(int p = i; p <= j; p++) {
                dq.addLast(list.get(p));
            }
            
            for(int p = i; p < k; p++) {
                int a = dq.pollFirst();
                dq.addLast(a);
            }
            
            for (int p = i; p <= j; p++) {
                list.set(p, dq.pollFirst());
            }
        }
        
        int size = list.size();
        for (int i = 1; i < size; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}