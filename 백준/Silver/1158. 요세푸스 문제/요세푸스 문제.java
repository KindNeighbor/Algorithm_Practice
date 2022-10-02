
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            queue.offer(i+1);
        }
        int cnt = 1;
        while (!queue.isEmpty()) {

            if (cnt != K) {
                int x = queue.poll();
                queue.offer(x);
                cnt++;
            } else if (cnt == K) {
                int y = queue.poll();
                list.add(y);
                cnt = 1;
            }
        }
        System.out.print("<");
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.print(list.get(list.size() - 1) + ">");
    }
}