import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int max = Integer.MIN_VALUE;
        for (int i = 4; i <= N; i++) {
            String s = String.valueOf(i);
            int cnt = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '4' || s.charAt(j) == '7') {
                    cnt++;
                } else {
                    break;
                }
            }
            if (cnt == s.length()) {
                max = Math.max(max, i);
            }
        }
        System.out.println(max);
    }
}