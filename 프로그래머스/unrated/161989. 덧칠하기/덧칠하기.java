import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        
        int[] arr = new int[n+1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        
        for (int i = 0; i < section.length; i++) {
            arr[section[i]] = 0;
        }

        int cnt = 0;
        for (int i = 0; i < section.length; i++) {
            if (arr[section[i]] == 0) {
                for (int j = section[i]; j < section[i] + m; j++) {
                    if (j == arr.length) {
                        break;
                    }
                    arr[j] = 1;
                }
                cnt++;
            } else continue;
        }

        return cnt;
    }
}