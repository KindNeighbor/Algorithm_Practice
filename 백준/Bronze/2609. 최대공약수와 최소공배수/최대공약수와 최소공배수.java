import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = sol(a,b);
        System.out.println(c);
        System.out.println(a*b/c);
    }

    public static int sol(int a, int b) {
        if(b == 0) {
            return a;
        }
        return sol(b, a % b);
    }
}
