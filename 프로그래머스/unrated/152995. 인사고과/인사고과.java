import java.util.*;

class Solution {
    public int solution(int[][] scores) {
        int ans = 1;
        int[] arr = scores[0];
        
        Arrays.sort(scores, (s1, s2) -> {
            if (s1[0] == s2[0]) {
                return s1[1] - s2[1];
            }
            return s2[0] - s1[0];
        });
        
        int pnt = arr[0] + arr[1];
        int max = 0;
        for (int[] score : scores) {
            if (score[1] < max) {
                if (arr[0] == score[0] && arr[1] == score[1]) return -1;
            } else {
                max = Math.max(max, score[1]);
                if (pnt < score[0] + score[1]) ans++;
            }
        }
        return ans;
    }
}