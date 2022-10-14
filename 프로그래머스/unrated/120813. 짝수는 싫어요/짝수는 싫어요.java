class Solution {
    public int[] solution(int n) {
        int a = (n + 1) / 2;
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 2 * (i + 1) - 1;
        }
        
        return arr;
    }
}