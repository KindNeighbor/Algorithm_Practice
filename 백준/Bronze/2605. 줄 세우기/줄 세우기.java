import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        list.add(0);

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 1; i <= N; i++) {
            int a = Integer.parseInt(st.nextToken());
            list.add(a, i);
        }

        for (int i = N - 1; i > 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.print(list.get(0));
    }
}