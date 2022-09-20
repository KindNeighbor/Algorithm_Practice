import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        int idx = 0;

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());

            if (a > idx) {
                for (int j = idx + 1; j <= a; j++) {
                    stack.push(j);
                    sb.append("+").append("\n");
                }
                idx = a;
            } else if (stack.peek() != a) {
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append("-").append("\n");
        }
        System.out.println(sb);
    }
}