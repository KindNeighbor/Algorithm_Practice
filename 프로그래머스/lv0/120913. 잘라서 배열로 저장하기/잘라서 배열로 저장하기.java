import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        ArrayList<String> sList = new ArrayList<>();
        
        int a = 0;
        while (my_str.length() > 0) {
            
            if (my_str.length() <= n) {
                sList.add(my_str);
                break;
            }
            
            sList.add(my_str.substring(a, a + n));
            my_str = my_str.substring(a + n);
            
        }
        
        
        String[] result = sList.stream().toArray(String[]::new);
        
        return result;
    }
}