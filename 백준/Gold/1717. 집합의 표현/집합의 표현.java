import java.io.*;
import java.util.*;

public class Main {

    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int check = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            switch (check) {
                case 0:
                    union(a,b);
                    break;
                case 1:
                    sb.append((isUnion(a, b) ? "YES" : "NO") + "\n");
                    break;
            }
        }

        System.out.println(sb);
    }

    public static int find(int x) {
        if (arr[x] == x) {
            return x;
        }

        return arr[x] = find(arr[x]);
    }

    public static void union(int a, int b) {
        int A = find(a);
        int B = find(b);

        arr[B] = A;
    }

    public static boolean isUnion(int a, int b) {
        int A = find(a);
        int B = find(b);

        if (A == B) {
            return true;
        }

        return false;
    }
}