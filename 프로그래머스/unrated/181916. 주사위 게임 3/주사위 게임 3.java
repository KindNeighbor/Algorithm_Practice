import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        map.put(a, map.getOrDefault(a, 0) + 1);
        map.put(b, map.getOrDefault(b, 0) + 1);
        map.put(c, map.getOrDefault(c, 0) + 1);
        map.put(d, map.getOrDefault(d, 0) + 1);
        
        HashSet<Integer> set = new HashSet<>();
        int[] arr = new int[2];
        int idx = 0;
        int min = 10;
        
        int p = 0;
        int q = 0;
        
        if (map.size() == 1) {
            return 1111 * a;
        } else if (map.size() == 2) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 3) {
                    p = entry.getKey();
                } else if (entry.getValue() == 1) {
                    q = entry.getKey();
                } else if (entry.getValue() == 2) {
                    set.add(entry.getKey());
                }
            }
            
            if (set.size() == 0) {
                return (10 * p + q) * (10 * p + q);
            } else {
                for (int num : set) {
                    arr[idx] = num;
                    idx++;
                }
                return (arr[0] + arr[1]) * Math.abs(arr[0] - arr[1]);
            }
        } else if (map.size() == 3) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 2) {
                    p = entry.getKey();
                } else if (entry.getValue() == 1) {
                    arr[idx] = entry.getKey();
                    idx++;
                } 
            }
            
            return arr[0] * arr[1];
            
        } else {
            min = Math.min(a, b);
            min = Math.min(min, c);
            min = Math.min(min, d);
            return min;
        }
    }
}