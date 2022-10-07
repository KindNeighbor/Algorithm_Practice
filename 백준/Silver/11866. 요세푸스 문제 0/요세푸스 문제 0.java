
import java.io.*;
import java.util.*;

public class Main {

    public static int N,K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        ArrayList list = sol(N);
        sb.append("<");
        for (int i = 0; i < list.size() - 1; i++) {
            sb.append(list.get(i)).append(", ");
        }
        sb.append(list.get(list.size() - 1)).append(">");
        System.out.println(sb);
    }

    public static ArrayList sol(int N) {
        Queue qu = new LinkedList();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            qu.add(i+1);
        }

        int cnt = 0;
        while(!qu.isEmpty()) {
            int data = (int)qu.remove();
            cnt++;

            if(cnt % K == 0) {
                list.add(data);
            } else {
                qu.add(data);
            }
        }
        return list;
    }
}