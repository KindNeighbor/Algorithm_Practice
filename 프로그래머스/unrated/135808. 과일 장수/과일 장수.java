import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        
        int l = score.length / m;
        Integer[] integerScore = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(integerScore, Collections.reverseOrder());
        int sum = 0;
        
        for (int i = 0; i < l; i++) {
            sum += integerScore[m * (i + 1) - 1] * m;
        }
        
        return sum;
    }
}