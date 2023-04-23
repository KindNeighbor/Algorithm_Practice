import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char[] c1 = br.readLine().toCharArray();
        char[] c2 = br.readLine().toCharArray();
        
        int[][] dp = new int[c1.length + 1][c2.length + 1];
        
        for (int i = 1; i <= c1.length; i++) {
            for (int j = 1; j <= c2.length; j++) {
                if (c1[i - 1] == c2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        
        System.out.println(dp[c1.length][c2.length]);
        
        int col = c1.length;
        int row = c2.length;
        
        ArrayList<Character> list = new ArrayList<>();
        
        while(dp[col][row] != 0) {
            if (c1[col - 1] == c2[row - 1]) {
                list.add(c1[col - 1]);
                col--;
                row--;
            } else {
                if (dp[col - 1][row] >= dp[col][row - 1]) {
                    col--;
                } else {
                    row--;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = list.size() - 1; i >= 0; i--) {
            sb.append(list.get(i));
        }
        System.out.println(sb);
    }
}