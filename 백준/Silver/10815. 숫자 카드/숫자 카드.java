import java.io.*;
import java.util.*;

public class Main {

    public static int N,M;
    public static int[] a;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        a = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < M; i++) {
            int b = Integer.parseInt(st.nextToken());
            if(b_search(b)) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
    }

    private static boolean b_search(int x) {
        int L_index = 0;
        int R_index = N - 1;

        while(L_index <= R_index) {
            int M_index = (L_index + R_index) / 2;
            int mid = a[M_index];

            if(x < mid) {
                R_index = M_index - 1;
            } else if(x > mid) {
                L_index = M_index + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}