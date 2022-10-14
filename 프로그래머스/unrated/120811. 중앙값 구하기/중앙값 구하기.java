import java.util.*;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int ans = array[(array.length + 1) / 2 - 1];
        return ans;
    }
}