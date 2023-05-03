import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        Arrays.sort(indices);
        for (int i = 0; i < my_string.length(); i++) {
            if (i == indices[idx]) {
                if (idx == indices.length - 1) {
                    continue;
                } else {
                    idx++;
                    continue;
                }
            } else {
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();
    }
}