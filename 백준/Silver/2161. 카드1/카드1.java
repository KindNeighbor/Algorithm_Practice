import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();
        
        for (int i = 0; i < N; i++) {
            dq.add(i+1);
        }
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < N; i++) {
            int a = dq.removeFirst();
            sb.append(a).append(" ");
            if (dq.size() == 0) {
                break;
            }
            int b = dq.removeFirst();
            dq.addLast(b);
        }
        
        System.out.println(sb);
    }
}