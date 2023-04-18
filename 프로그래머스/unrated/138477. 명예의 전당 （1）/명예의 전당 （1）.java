import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> last = new ArrayList<>();
        
        for (int i = 0; i < score.length; i++) {
            list.add(score[i]);
            Collections.sort(list, Collections.reverseOrder());
            if (i < k) {
                last.add(list.get(list.size() - 1));
            } else {
                last.add(list.get(k - 1));
            }
        }
        
        int[] ans = new int[last.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = last.get(i);
        }
        
        return ans;
    }
}