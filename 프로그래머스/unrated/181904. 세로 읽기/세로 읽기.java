import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        int l = my_string.length() / m;
        char[][] arr = new char[l][m];
        
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = my_string.charAt(j + i * m);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < l; i++) {
            sb.append(arr[i][c - 1]);
        }
        
        return sb.toString();
    }
}