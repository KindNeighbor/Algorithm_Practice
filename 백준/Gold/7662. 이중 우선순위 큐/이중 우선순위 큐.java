import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < T; i++) {
            TreeMap<Integer, Integer> tm = new TreeMap<>();
            int a = Integer.parseInt(br.readLine());
            for (int j = 0; j < a; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                switch (st.nextToken()) {
                    case "I":
                        int b = Integer.parseInt(st.nextToken());
                        tm.put(b, tm.getOrDefault(b, 0) + 1);
                        break;

                    case "D":
                        int c = Integer.parseInt(st.nextToken());
                        if (tm.size() == 0) {
                            break;
                        } else {
                            if (c == 1) {
                                int max = tm.lastKey();
                                if (tm.get(max) == 1) {
                                    tm.remove(max);
                                } else {
                                    tm.put(max, tm.get(max) - 1);
                                }
                            } else {
                                int min = tm.firstKey();
                                if (tm.get(min) == 1) {
                                    tm.remove(min);
                                } else {
                                    tm.put(min, tm.get(min) - 1);
                                }
                            }
                        }
                        break;
                }
            }

            if (tm.size() == 0) {
                System.out.println("EMPTY");
            } else {
                System.out.println(tm.lastKey() + " " + tm.firstKey());
            }
        }
    }
}
