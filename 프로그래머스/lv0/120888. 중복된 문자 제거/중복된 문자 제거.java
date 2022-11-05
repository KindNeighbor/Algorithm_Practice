import java.util.*;

class Solution {
    public String solution(String my_string) {
        LinkedHashSet<Character> lSet = new LinkedHashSet<>();
        for (int i = 0; i < my_string.length(); i++) {
            lSet.add(my_string.charAt(i));
        }
        
        StringBuilder sb = new StringBuilder();
        for (Character a : lSet) {
            sb.append(a);
        }
        
        return sb.toString();
    }
}