import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb;

        for (int i = 0; i < N; i++) {
            sb = new StringBuilder();
            Stack<Character> stack = new Stack<>();
            String s = br.readLine() + "\n";
            for (char ch : s.toCharArray()) {
                if (ch == ' ' || ch == '\n') {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(ch);
                } else {
                    stack.push(ch);
                }
            }
            System.out.print(sb);
        }
    }
}