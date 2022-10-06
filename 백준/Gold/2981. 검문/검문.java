
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(br.readLine());
            list.add(a);
        }

        Collections.sort(list);
        int b = list.get(1) - list.get(0);
        for (int i = 1; i < list.size() - 1; i++) {
            b = gcd(b, list.get(i+1) - list.get(i));
        }

        for (int i = 2; i <= b / 2; i++) {
            if (b % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print(b);
    }

    public static int gcd (int x, int y) {
        if (x % y == 0) {
            return y;
        }

        return gcd(y, x % y);
    }
}
