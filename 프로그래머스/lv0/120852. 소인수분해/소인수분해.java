import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        HashSet<Integer> set = new HashSet<>();
        
        int idx = 2;
        
        while (n > 1) {
            if (n % idx == 0) {
                set.add(idx);
                n /= idx;
            } else {
                idx++;
            }
        }
        
        int[] arr = new int[set.size()];
        int idx1 = 0;
        for (Integer a : set) {
            arr[idx1] =  a;
            idx1++;
        }
        
        Arrays.sort(arr);
        return arr;
    }
}