import java.io.*;
import java.util.Stack;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(br.readLine());
            stack.push(a);
        }

        int cnt = 0;
        int max = 0;
        for (int i = 0; i < N; i++) {
            if (stack.peek() > max) {
                max = stack.peek();
                stack.pop();
                cnt++;
            } else if (stack.peek() == max || stack.peek() < max) {
                stack.pop();
            }
        }
        System.out.println(cnt);
    }
}
