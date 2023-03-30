import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    static int[] arr;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        arr = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = i;
        }

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 1; j <= N; j++) {
                int visit = Integer.parseInt(st.nextToken());
                if (visit == 1) {
                    union(i, j);
                }
            }
        }

        st = new StringTokenizer(br.readLine(), " ");
        
        int init = find(Integer.parseInt(st.nextToken()));
        for (int i = 1; i < M; i++) {
            int city = Integer.parseInt(st.nextToken());
            
            if (init != find(city)) {
                System.out.println("NO");
                return;
            }
        }
        
        System.out.println("YES");
    }

    static int find(int x) {
        if (x == arr[x]) {
            return x;
        }
        return arr[x] = find(arr[x]);
    }

    static void union(int a, int b) {
        int A = find(a);
        int B = find(b);
        
        arr[B] = A;
    }
}
