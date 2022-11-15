import java.util.*;

class Solution {
    public int solution(String before, String after) {
        char[] c1 = before.toCharArray();
        char[] c2 = after.toCharArray();
        
        Arrays.sort(c1);
        Arrays.sort(c2);
        
        int cnt = 0;
        for (int i = 0; i < before.length(); i++) {
            if (c1[i] == c2[i]) {
                cnt++;
            }
        }
        
        if (cnt == before.length()) {
            return 1;
        } else {
            return 0;
        }
    }
}