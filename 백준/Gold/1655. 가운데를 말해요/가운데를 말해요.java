import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> min_pq = new PriorityQueue<>();
        PriorityQueue<Integer> max_pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(br.readLine());
            if(max_pq.size() == min_pq.size()) {
                max_pq.offer(a);
                if(min_pq.size() != 0 && max_pq.peek() > min_pq.peek()) {
                    min_pq.offer(max_pq.poll());
                    max_pq.offer(min_pq.poll());
                }
            } else {
                min_pq.offer(a);
                if(max_pq.peek() > min_pq.peek()) {
                    min_pq.offer(max_pq.poll());
                    max_pq.offer(min_pq.poll());
                }
            }
            sb.append(max_pq.peek()).append("\n");
        }
        System.out.println(sb);
    }
}
