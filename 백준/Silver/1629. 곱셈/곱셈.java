import java.io.*;
import java.util.*;

public class Main {

    static long C;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        C = Long.parseLong(st.nextToken());

        System.out.println(Calculate(A, B));
    }

    public static long Calculate(long A, long num) {
        if (num == 1) {
            return A % C;
        }

        long val = Calculate(A, num / 2);

        if (num % 2 != 0) {
            return (val * val % C) * A % C;
        }
        
        return val * val % C;
    }
}