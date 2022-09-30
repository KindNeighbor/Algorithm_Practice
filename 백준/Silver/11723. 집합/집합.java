import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    static HashSet<Integer> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {
                case "add":
                    add(Integer.parseInt(st.nextToken()));
                    break;

                case "remove":
                    remove(Integer.parseInt(st.nextToken()));
                    break;

                case "check":
                    sb.append(check(Integer.parseInt(st.nextToken()))).append("\n");
                    break;

                case "toggle":
                    toggle(Integer.parseInt(st.nextToken()));
                    break;

                case "all":
                    all();
                    break;

                case "empty":
                    empty();
                    break;
            }
        }
        System.out.println(sb);
    }

    public static void add(int x) {
        set.add(x);
    }

    public static int check(int x) {
        if (set.contains(x)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void remove(int x) {
        if (set.contains(x)) {
            set.remove(x);
        } else {
            return;
        }
    }

    public static void toggle(int x) {
        if (set.contains(x)) {
            set.remove(x);
        } else {
            set.add(x);
        }
    }

    public static void all() {
        set.clear();
        for (int i = 0; i < 20; i++) {
            set.add(i+1);
        }
    }

    public static void empty() {
        set.clear();
    }
}
