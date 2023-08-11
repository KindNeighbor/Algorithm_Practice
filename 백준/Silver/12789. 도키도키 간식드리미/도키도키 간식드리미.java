import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Stack<Integer> s1 = new Stack<>();

        int cur1 = 1;

        for (int i = 0; i < N; i ++) {
            int a = Integer.parseInt(st.nextToken());
            if (a == cur1) {
                cur1 += 1;
            } else {
                while (!s1.isEmpty()) {
                    if (s1.peek() == cur1) {
                        s1.pop();
                        cur1 += 1;
                    } else {
                        break;
                    }
                }
                s1.push(a);
            }
        }

        while (!s1.isEmpty()) {
            if (s1.peek() == cur1) {
                s1.pop();
                cur1 += 1;
            } else {
                break;
            }
        }

        if (s1.size() == 0) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}