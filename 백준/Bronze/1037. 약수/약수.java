import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<a; i++) {
            int n = Integer.parseInt(st.nextToken());
            if(n > max) {
                max = n;
            }
            if(n < min) {
                min = n;
            }
        }
        System.out.print(max*min);
    }
}