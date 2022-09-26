import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int a = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    reserve[j] = -1;
                    lost[i] = -1;
                    a++;
                    break;
                }
            }
        } 
        
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
                    a++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return a;
    }
}