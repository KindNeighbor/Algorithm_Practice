class Solution {
    public int[] solution(int[] array) {
        int idx = 0;
        int max = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                idx = i;
                max = array[i];
            }
        }
        
        int[] arr = new int[2];
        arr[0] = max; arr[1] = idx;
        return arr;
    }
}