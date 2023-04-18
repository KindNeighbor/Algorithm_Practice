import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        
        int[] ans = new int[photo.length];
        
        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            for (int j = 0; j < photo[i].length; j++) {
                for (Map.Entry<String, Integer> entry : map.entrySet()) {
                    if (photo[i][j].equals(entry.getKey())) {
                        sum += entry.getValue();
                        break;
                    }
                }
            }
            ans[i] = sum;
        }
        
        return ans;
    }
}