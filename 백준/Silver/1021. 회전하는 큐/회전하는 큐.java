import java.io.*;
import java.util.*;

public class Main {

    static  LinkedList<Integer> dq = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            dq.add(i + 1);
        }

        int cnt = 0;

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            int a = Integer.parseInt(st.nextToken());
            while (dq.peekFirst() != a) {
                if (dq.indexOf(a) <= dq.size() / 2) {
                    rotateLeft();
                } else {
                    rotateRight();
                }
                cnt++;
            }
            dq.pollFirst();
        }

        System.out.println(cnt);
    }

    public static void rotateLeft() {
        int val = dq.pollFirst();
        dq.addLast(val);
    }

    public static void rotateRight() {
        int val = dq.pollLast();
        dq.addFirst(val);
    }
}