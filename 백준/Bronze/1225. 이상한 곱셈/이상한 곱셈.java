import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        String a = st.nextToken();
        String b = st.nextToken();
        
        int la = a.length();
        int lb = b.length();
        
        long sum = 0;
        
        for (int i = 0; i < la; i++) {
            for (int j = 0; j < lb; j++) {
                sum += (a.charAt(i) - '0') * (b.charAt(j) - '0');
            }
        }
        System.out.println(sum);
    }
}