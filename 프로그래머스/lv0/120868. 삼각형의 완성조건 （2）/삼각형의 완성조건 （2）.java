import java.util.*;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        
        int cnt1 = 0;
        int cnt2 = 0;
        
        cnt1 = sides[0];
        cnt2 = sides[0] + sides[1] - 1 - sides[1];
        
        return cnt1 + cnt2;
    }
}