import java.util.*;

class Solution {
    public int[] solution(String s) {
        
        int deleteZeroNum = 0;
        int lengthAfter = 0;
        int cnt = 0;
        
        while (!s.equals("1")) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    deleteZeroNum += 1;
                } else {
                    continue;
                }
            }
            
            s = s.replace("0","");
            lengthAfter = s.length();
            s = Integer.toBinaryString(lengthAfter);
            cnt += 1;
        }
        
        return new int[]{cnt, deleteZeroNum};
    }
}