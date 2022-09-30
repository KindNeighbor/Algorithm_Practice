import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            pq.add(Long.parseLong(br.readLine()));
        }
        long sum = 0;

        if (pq.size() == 1) {
            System.out.println(0);
            return;
        }

        while (pq.size() != 1 && !pq.isEmpty()) {
            long temp = pq.poll() + pq.poll();
            pq.add(temp);
            sum += temp;
        }
        System.out.println(sum);
    }
}
