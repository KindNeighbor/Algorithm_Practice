import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        map.put(a, map.getOrDefault(a, 0) + 1);
        map.put(b, map.getOrDefault(b, 0) + 1);
        map.put(c, map.getOrDefault(c, 0) + 1);
        map.put(d, map.getOrDefault(d, 0) + 1);
        
        int p = 0;
        int q = 0;
        int r = 0;
        int ans = 1;
        
        if (map.size() == 1) {
            return 1111 * a;
            
        } else if (map.size() == 2) {
            for (int i : map.keySet()) {
                if (map.get(i) == 3) {
                    p = i;
                } else if (map.get(i) == 1) {
                    q = i;
                } else {
                    if (r == 0) {
                        r = i;
                    } else {
                        return (r + i) * Math.abs(r - i);
                    }
                }
            }
            
            return (10 * p + q) * (10 * p + q);
            
        } else if (map.size() == 3) {
            
            for (int i : map.keySet()) {
                if (map.get(i) == 1) {
                    ans *= i;
                }
            }
            
            return ans;
            
        } else {
            
            return Math.min(a, Math.min(b, Math.min(c, d)));
        }
    }
}