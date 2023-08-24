import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> dq = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            switch(s.charAt(0)) {
                case '1' :
                    String[] sArr1 = s.split(" ");
                    int a = Integer.parseInt(sArr1[1]);
                    dq.addFirst(a);
                    break;
                case '2' :
                    String[] sArr2 = s.split(" ");
                    int b = Integer.parseInt(sArr2[1]);
                    dq.addLast(b);
                    break;
                case '3' :
                    if (!dq.isEmpty()) {
                        int c = dq.removeFirst();
                        sb.append(c).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
                case '4' :
                    if (!dq.isEmpty()) {
                        int c = dq.removeLast();
                        sb.append(c).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
                case '5' :
                    sb.append(dq.size()).append("\n");
                    break;
                case '6' :
                    if (!dq.isEmpty()) {
                        sb.append(0).append("\n");
                    } else {
                        sb.append(1).append("\n");
                    }
                    break;
                case '7' :
                    if (!dq.isEmpty()) {
                        sb.append(dq.getFirst()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
                case '8' :
                    if (!dq.isEmpty()) {
                        sb.append(dq.getLast()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}