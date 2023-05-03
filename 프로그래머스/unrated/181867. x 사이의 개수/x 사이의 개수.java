import java.util.*;

class Solution {
    public int[] solution(String myString) {
        String[] s = myString.split("x");
        System.out.print(Arrays.toString(s));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            list.add(s[i].length());
        }
        
        if (myString.charAt(myString.length() - 1) == 'x') {
            list.add(0);
        }
        
        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}