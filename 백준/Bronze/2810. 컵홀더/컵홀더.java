import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'S') {
                cnt++;
            } else if (s.charAt(i) == 'L') {
                cnt++;
                i++;
                if (i == s.length()) {
                    break;
                }
            }

        }
        
        if (cnt + 1 >= N) {
            System.out.println(N);
        } else {
            System.out.println(cnt + 1);
        }
    }
}