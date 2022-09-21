import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int[] arr = new int[a];

            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < a; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            sol(a, b, arr);
        }
    }
    
    private static void sol(int docs, int target, int[] priority) {
        Queue<Doc> queue = new LinkedList<>();

        for (int i = 0; i < docs; i++) {
            queue.add(new Doc(i, priority[i]));
        }

        int cnt = 1;
        while (true) {
            Doc cur = queue.poll();

            Doc[] highP = queue.stream().filter(x -> x.priority > cur.priority).toArray(Doc[]::new);

            if (highP.length > 0) {
                queue.add(cur);
            } else {
                if (cur.no == target) {
                    System.out.println(cnt);
                    break;
                }
                cnt++;
            }
        }
    }

    static class Doc {
        int no;
        int priority;

        public Doc(int no, int priority) {
            this.no = no;
            this.priority = priority;
        }
    }
}