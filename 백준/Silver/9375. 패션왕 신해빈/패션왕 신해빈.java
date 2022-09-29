import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int a = Integer.parseInt(br.readLine());
            HashMap<String, Integer> map = new HashMap<>();
            for (int j = 0; j < a; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String s1 = st.nextToken();
                String s2 = st.nextToken();
                if (map.containsKey(s2)) {
                    map.put(s2, map.get(s2) + 1);
                } else {
                    map.put(s2, 1);
                }
            }

            int time = 1;
            for (Integer value : map.values()) {
                time *= (value + 1);
            }

            int ans = time;
            System.out.println(ans - 1);
        }
    }
}
