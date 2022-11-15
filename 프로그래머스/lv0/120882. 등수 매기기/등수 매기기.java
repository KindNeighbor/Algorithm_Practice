import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        
        int[] arr2 = {1};
        if (score.length == 1) {
            return arr2;
        }

        ArrayList<Double> list = new ArrayList<>();
        ArrayList<Double> list1 = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            list.add((double)(score[i][0] + score[i][1]) / 2);
            list1.add((double)(score[i][0] + score[i][1]) / 2);
        }

        Collections.sort(list, Collections.reverseOrder());
        
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            int cnt = 1;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    cnt++;
                }
            }
            arr[i] = cnt;
        }
        

        HashMap<Double, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i),arr[i]);
        }

        int[] arr1 = new int[list1.size()];
        for (int i = 0; i < list1.size(); i++) {
            arr1[i] = map.get(list1.get(i));
        }

        return arr1;
    }
}