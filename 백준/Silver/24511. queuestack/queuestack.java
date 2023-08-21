import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] type = new int[N];
        Deque<Integer> dq = new LinkedList<>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            type[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (type[i] == 0) {
                dq.addLast(a);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int c = Integer.parseInt(st.nextToken());
            dq.addFirst(c);
            int b = dq.removeLast();
            sb.append(b).append(" ");
        }
        
        System.out.println(sb);
    }
}