import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        int a = 1500000;
        long[] lArr = new long[a];
        lArr[0] = 0;
        lArr[1] = 1;

        for (int i = 2; i < a && i <= n; i++) {
            lArr[i] = (lArr[i-1] + lArr[i-2]) % 1000000;
        }
        
        if (n >= a) {
            n %= a;
        }

        System.out.println(lArr[(int)n]);
    }
}
