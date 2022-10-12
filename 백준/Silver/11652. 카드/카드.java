import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashMap<Long, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            long a = Long.parseLong(br.readLine());
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        int max = -1;
        long ans = 0;
        for (Map.Entry<Long, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                ans = entry.getKey();
            } else if (entry.getValue() == max) {
                if (ans > entry.getKey()) {
                    ans = entry.getKey();
                }
            }
        }

        System.out.println(ans);
    }
}