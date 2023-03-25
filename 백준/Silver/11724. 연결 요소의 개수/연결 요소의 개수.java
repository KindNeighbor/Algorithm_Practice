import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    
    static int[] parents;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        parents = new int[N + 1];

        for (int i = 1; i < N + 1; i++) {
            parents[i] = i;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            union(u,v);
        }

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 1; i < N + 1; i++) {
            hashSet.add(find(i));
        }
        
        System.out.println(hashSet.size());
    }

    public static void union(int a, int b) {
        int aP = find(a);
        int bP = find(b);

        if (aP != bP) {
            parents[aP] = bP;
        }
    }

    public static int find(int a) {
        if (a == parents[a]) {
            return a;
        }
        return parents[a] = find(parents[a]);
    }
}