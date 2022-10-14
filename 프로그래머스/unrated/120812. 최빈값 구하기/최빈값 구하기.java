import java.util.*;

class Solution {
    public int solution(int[] array) {
        int[] arr = new int[2001];
        for (int i = 0; i < array.length; i++) {
            arr[array[i] + 1000]++;
        }
        int max = Integer.MIN_VALUE;
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = Math.max(arr[i], max);
                idx = i - 1000;
            }
        }

        Arrays.sort(arr);
        if (arr[arr.length - 1] == arr[arr.length - 2]) {
            return -1;
        } else {
            return idx;
        }
    }
}