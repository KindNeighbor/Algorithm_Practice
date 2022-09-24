import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] arr = new int[commands.length];  
        for (int i = 0; i < commands.length; i++) {
            ArrayList<Integer> list1 = new ArrayList<>();
            for (int j = commands[i][0]; j <= commands[i][1]; j++) {
                list1.add(array[j-1]);
            }
            Collections.sort(list1);
            arr[i] = list1.get(commands[i][2] - 1);
        }
        return arr;
    }
}