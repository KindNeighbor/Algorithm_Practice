import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            
            String s = "";
            
            if (a >= b + c || b >= c + a || c >= b + a) {
                s = "invalid!";
            } else {
                if (a == b && b == c) {
                    s = "equilateral";
                } else if ((a == b && a != c && b != c) ||
                          (b == c && b != a && c != a) ||
                          (c == a && c != b && a != b)) {
                    s = "isosceles";
                } else if (a != b && b != c && c != a) {
                    s = "scalene";
                }
            }
            
            System.out.println("Case " + "#" + (i+1) + ": " + s);
        }
    }
}