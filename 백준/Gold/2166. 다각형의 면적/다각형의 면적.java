import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        ArrayList<Pos> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.add(new Pos(x, y));
        }

        long sum = 0;
        for (int i = 1; i < N - 1; i++) {
            sum += CCW(list.get(0), list.get(i), list.get(i+1));
        }

        long absSum = Math.abs(sum);

        if (sum % 2 == 0) {
            System.out.println(absSum / 2 + ".0");
        } else {
            System.out.println(absSum / 2 + ".5");
        }

    }

    public static long CCW(Pos i, Pos j, Pos k) {
        long val = (i.x * j.y + j.x * k.y + k.x * i.y) - (i.y * j.x + j.y * k.x + k.y * i.x);
        return val;
    }

    public static class Pos {
        long x;
        long y;

        public Pos(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }
}
