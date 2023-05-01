import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        String s = st.nextToken();
        int N = Integer.parseInt(st.nextToken());
        int ans = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                ans += (s.charAt(i) - '0') * Math.pow(N, s.length() - 1 - i);
            } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                ans += (s.charAt(i) - 55) * Math.pow(N, s.length() - 1 - i);
        }
        
        System.out.print(ans);
    }
}