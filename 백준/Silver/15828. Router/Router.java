import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        while (true) {
            int a = Integer.parseInt(br.readLine());

            if (a == -1) {
                break;
            }

            if (a == 0) {
                if (!queue.isEmpty()) {
                    queue.poll();
                }
            } else {
                if (queue.size() < N) {
                    queue.offer(a);
                }
            }
        }

        if (queue.isEmpty()) {
            System.out.println("empty");
        } else {
            while (!queue.isEmpty()) {
                System.out.print(queue.poll() + " ");
            }
        }
    }
}