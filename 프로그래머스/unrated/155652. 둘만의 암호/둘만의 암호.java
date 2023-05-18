import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        int[] alpha = new int[26];
        for (int i = 0; i < skip.length(); i++) {
            alpha[skip.charAt(i) - 'a'] = 1;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int a = s.charAt(i) - 'a';
            for (int j = 0; j < index; j++) {
                
                if (a == 25) a = 0;
                else a++;
                
                if (alpha[a] == 1) {
                    j--;
                    continue;
                }
            }
            sb.append((char)(a + 'a'));
        }
        return sb.toString();
    }
}