import java.util.*;

class Solution {
    public String solution(String s) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 97]++;
        }
        

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                sb.append((char)(97 + i));
            }
        }
        
        return sb.toString();
    }
}