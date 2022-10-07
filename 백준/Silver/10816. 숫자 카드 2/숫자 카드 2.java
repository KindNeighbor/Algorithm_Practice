import java.io.*;
import java.util.*;

public class Main {

    public static int N,M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> m = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(st.nextToken());
            if(m.get(x) == null) {
                m.put(x, 1);
            } else {
                m.put(x, m.get(x) + 1);
            }
        }

        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < M; i++) {
            int y = Integer.parseInt(st.nextToken());
            if(m.get(y) == null) {
                sb.append("0").append(" ");
            } else {
                sb.append(m.get(y)).append(" ");
            }
        }
        System.out.println(sb);
    }
}