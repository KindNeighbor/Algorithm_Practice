import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = br.readLine();
            if (input.equals("0")) {
                break;
            }

            int a = Integer.parseInt(input);
            HashSet<Integer> set = new HashSet<>();
            int cnt = 0;

            while (!set.contains(a)) {
                set.add(a);
                cnt++;
                a = sol(a);
            }

            System.out.println(cnt);
        }
    }

    private static int sol(int num) {
        int square = num * num;
        String squareStr = String.format("%08d", square);
        String nextStr = squareStr.substring(2, 6);
        return Integer.parseInt(nextStr);
    }
}