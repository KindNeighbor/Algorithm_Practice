import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayDeque<Integer> dq;

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {

            dq = new ArrayDeque<>();

            StringBuilder sb = new StringBuilder();

            String s = br.readLine();
            int N = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine(), "[,]");
            for (int j = 0; j < N; j++) {
                dq.add(Integer.parseInt(st.nextToken()));
            }

            int flag = 1;
            int cnt = 0;
            for (int j = 0; j < s.length(); j++) {
                if (cnt == 1) {
                    break;
                }
                switch (s.charAt(j)) {
                    case 'R':
                        flag *= -1;
                        break;
                    case 'D':
                        if (dq.size() == 0) {
                            sb.append("error");
                            cnt++;
                            break;
                        } else {
                            if (flag == 1) {
                                dq.pollFirst();
                            } else if (flag == -1) {
                                dq.pollLast();
                            }
                        }
                        break;
                }
            }
            int length = dq.size();

            if (dq.size() == 0) {
                if ("error".equals(sb.toString())) {
                    System.out.println(sb);
                } else {
                    System.out.println("[]");
                }
            } else {
                if (flag == 1) {
                    sb.append("[");
                    for (int j = 0; j < length - 1; j++) {
                        sb.append(dq.pollFirst()).append(",");
                    }
                    sb.append(dq.pollFirst()).append("]");
                    System.out.println(sb);
                } else if (flag == -1) {
                    sb.append("[");
                    for (int j = 0; j < length - 1; j++) {
                        sb.append(dq.pollLast()).append(",");
                    }
                    sb.append(dq.pollLast()).append("]");
                    System.out.println(sb);
                }
            }
        }
    }
}