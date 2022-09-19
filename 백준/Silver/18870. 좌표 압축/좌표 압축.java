import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr1 = new int[N];
        int[] arr2 = new int[N];

        HashMap<Integer, Integer> hm = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr1[i] = arr2[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr2);

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (!hm.containsKey(arr2[i])) {
                hm.put(arr2[i], cnt);
                cnt++;
            }
        }

        for (int i = 0; i < N; i++) {
            int a = hm.get(arr1[i]);
            sb.append(a).append(" ");
        }
        System.out.println(sb);
    }
}