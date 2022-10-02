import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        StringTokenizer st;

        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            stack1.push(c[i]);
        }
        int idx = 0;

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {
                case "L" :
                    if (stack1.size() > 0) {
                        char c1 = stack1.pop();
                        stack2.push(c1);
                    }
                    break;

                case "D" :
                    if (stack2.size() > 0)
                        stack1.push(stack2.pop());
                    break;

                case "B" :
                    if (stack1.size() > 0) {
                        stack1.pop();
                    }
                    break;

                case "P" :
                    char c2 = st.nextToken().charAt(0);
                    stack1.push(c2);
                    break;
            }
        }
        int size2 = stack2.size();
        for (int i = 0; i < size2; i++) {
            stack1.push(stack2.pop());
        }
        int size1 = stack1.size();
        Stack<Character> stack3 = new Stack<>();
        for (int i = 0; i < size1; i++) {
            stack3.push(stack1.pop());
        }
        int size3 = stack3.size();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size3; i++) {
            sb.append(stack3.pop());
        }
        System.out.println(sb);
    }
}