import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < A; i++) {
            int a = Integer.parseInt(st.nextToken());
            set1.add(a);
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < B; i++) {
            int b = Integer.parseInt(st.nextToken());
            set2.add(b);
        }

        int cnt = 0;
        for (int item1 : set1) {
            if (!set2.contains(item1)) {
                cnt++;
            }
        }
        for (int item2 : set2) {
            if (!set1.contains(item2)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}