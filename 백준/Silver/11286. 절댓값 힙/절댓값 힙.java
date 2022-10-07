import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {

            @Override
            public int compare(Integer n1, Integer n2) {
                if(Math.abs(n1) > Math.abs(n2)) {
                    return Math.abs(n1) - Math.abs(n2);
                } else if (Math.abs(n1) == Math.abs(n2)) {
                    return n1 - n2;
                } else {
                    return -1;
                }
            }
        });

        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(br.readLine());
            if(a == 0) {
                if(pq.isEmpty()) {
                    System.out.println("0");
                } else {
                    System.out.println(pq.poll());
                }
            } else {
                pq.offer(a);
            }
        }
    }
}
