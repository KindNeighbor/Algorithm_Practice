import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        for (int i = 0; i < dots.length; i++) {
            set1.add(dots[i][0]);
        }
        
        for (int i = 0; i < dots.length; i++) {
            set2.add(dots[i][1]);
        }
        
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
        for (int a : set1) {
            list1.add(a);
        }
        
        for (int b : set2) {
            list2.add(b);
        }
        
        Collections.sort(list1);
        Collections.sort(list2);
        
        int row = list1.get(1) - list1.get(0);
        int col = list2.get(1) - list2.get(0);
        
        return row * col;
    }
}