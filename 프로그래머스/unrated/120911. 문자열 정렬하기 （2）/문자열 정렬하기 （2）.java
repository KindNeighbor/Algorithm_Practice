import java.util.*;

class Solution {
    public String solution(String my_string) {
        char[] c = my_string.toLowerCase().toCharArray();
        Arrays.sort(c);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < c.length; i++) {
            sb.append(c[i]);
        }
        return sb.toString();
    }
}