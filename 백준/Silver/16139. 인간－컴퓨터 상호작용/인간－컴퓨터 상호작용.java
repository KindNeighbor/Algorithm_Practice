import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String S = br.readLine();
        int q = Integer.parseInt(br.readLine());

        int[][] sum = new int[S.length()][26];

        sum[0][S.charAt(0) - 'a']++;

        for (int i = 1; i < S.length(); i++) {
            int a = S.charAt(i) - 'a';

            for (int j = 0; j < 26; j++) {
                sum[i][j] = sum[i - 1][j];
            }

            sum[i][a]++;
        }
        
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            char c = st.nextToken().charAt(0);
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            if (l == 0) {
                sb.append(sum[r][c - 'a']).append("\n");
            } else {
                sb.append(sum[r][c - 'a'] - sum[l - 1][c - 'a']).append("\n");
            }
        }
        System.out.println(sb);
    }
}