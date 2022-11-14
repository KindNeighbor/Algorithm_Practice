import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        
       HashMap<Integer, Integer> map = new HashMap<>();
       for (int i = 0; i < numlist.length; i++) {
           map.put(numlist[i], Math.abs(n - numlist[i]));
       }

       List<Integer> keySet = new ArrayList<>(map.keySet());

       System.out.println(keySet);

       Collections.sort(keySet, new Comparator<Integer>() {
           @Override
           public int compare(Integer o1, Integer o2) {
               if (map.get(o1).equals(map.get(o2))) {
                   return o2 - o1;
               } else {
                   return map.get(o1) - map.get(o2);
               }
           }
       });

       return keySet.stream().mapToInt(Integer::intValue).toArray();
    }
}