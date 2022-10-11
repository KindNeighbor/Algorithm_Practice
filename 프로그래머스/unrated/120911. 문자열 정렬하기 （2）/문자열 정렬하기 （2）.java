import java.util.*;

class Solution {
    public String solution(String my_string) {
        String s = my_string.toLowerCase();
        ArrayList<Character> list = new ArrayList<>();
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            list.add(c[i]);
        }
        
        Collections.sort(list);
        String s1 = "";
        for (int i = 0; i < list.size(); i++) {
            s1 += list.get(i);
        }
        return s1;
    }
}