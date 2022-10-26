import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        HashMap<Integer, Integer> map = new HashMap();
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < emergency.length; i++) {
            list.add(emergency[i]);
        }

        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), list.size() - i);
        }

        int[] arr = new int[emergency.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(emergency[i]);
        }

        return arr;
    }
}