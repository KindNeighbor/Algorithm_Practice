import java.io.*;
import java.util.*;

public class Main {

    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 1; j <= n; j++) {
                int check = Integer.parseInt(st.nextToken());
                if (check == 1) {
                    union(i, j);
                }
            }
        }

        st = new StringTokenizer(br.readLine(), " ");

        int start = find(Integer.parseInt(st.nextToken()));
        for (int i = 1; i < m; i++) {
            int city = Integer.parseInt(st.nextToken());
            
            if (start != find(city)) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
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