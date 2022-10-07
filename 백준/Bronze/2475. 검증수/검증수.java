import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        double ans = (Math.pow(a[0],2) + Math.pow(a[1],2) + Math.pow(a[2],2) +Math.pow(a[3],2) + Math.pow(a[4],2)) % 10;
        System.out.println((int)ans);
    }
}
