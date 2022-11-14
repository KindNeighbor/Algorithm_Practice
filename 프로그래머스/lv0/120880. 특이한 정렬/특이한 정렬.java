import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numlist.length; i++) {
            list.add(numlist[i]);
        }

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int absO1 = Math.abs(o1 - n);
                int absO2 = Math.abs(o2 - n);

                if (absO1 == absO2) {
                    return o2 - o1;
                } else {
                    return absO1 - absO2;
                }
            }
        });
        
        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        
        return arr;

        // return list.stream().mapToInt(Integer::intValue).toArray();
    }
}