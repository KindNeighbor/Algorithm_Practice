import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < strArr.length; i++) {
            map.put(strArr[i].length(), map.getOrDefault(strArr[i].length(), 0) + 1);
        }
        int max = -1;
        for (int x : map.values()) {
            max = Math.max(max, x);
        }

        return max;
    }
}