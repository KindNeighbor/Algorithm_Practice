
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < t - 1; i++) {
            int gcd1= gcd(arr[0], arr[i+1]);
            System.out.println(arr[0]/gcd1 + "/" + arr[i+1]/gcd1);
        }
    }

    public static int gcd (int x, int y) {
        if (x % y == 0) {
            return y;
        }
        return gcd(y, x%y);
    }
}