import java.util.*;

class Solution {
    public String solution(String my_string) {
        char[] c = my_string.toCharArray();
        char[] c1 = new char[c.length];

        for (int i = 0; i < c.length; i++) {
            c1[i] = c[c.length - 1 - i];
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < c1.length; i++) {
            sb.append(c1[i]);
        }
        
        return sb.toString();
    }
}