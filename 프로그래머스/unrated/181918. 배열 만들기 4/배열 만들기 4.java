import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        int l = arr.length;
        int i = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while (i < l) {
            if (list.size() == 0) {
                list.add(arr[i]);
                i++;
            } else if (arr[i] > list.get(list.size() - 1) && list.size() != 0) {
                list.add(arr[i]);
                i++;
            } else if (arr[i] <= list.get(list.size() - 1) && list.size() != 0) {
                list.remove(list.size() - 1);
            }
        } 
        
        int[] stk = new int[list.size()];
        
        for (int j = 0; j < stk.length; j++) {
            stk[j] = list.get(j);
        }
        
        return stk;
    }
}