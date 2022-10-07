import java.io.*;
import java.util.*;

public class Main {
    public static int a,b;
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        arr = new int[100001];

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        if(a >= b) {
            System.out.println(a - b);
        } else {
            System.out.println(bfs());
        }
    }

    public static int bfs() {
        Queue<Integer> q = new LinkedList<>();
        q.offer(a);
        arr[a] = 1;

        while(!q.isEmpty()) {
            int x = q.poll();

            for (int i = 0; i < 3; i++) {
                int nx;
                if(i == 0) {
                    nx = x - 1;
                } else if (i == 1) {
                    nx = x + 1;
                } else {
                    nx = x * 2;
                }

                if(nx == b) {
                    return arr[x];
                }

                if(nx >=0 && nx < 100001 && arr[nx] == 0) {
                        arr[nx] = arr[x] + 1;
                        q.offer(nx);
                }
            }
        }
        return 0;
    }
}
