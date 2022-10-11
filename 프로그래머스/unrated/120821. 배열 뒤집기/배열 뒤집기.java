class Solution {
    public int[] solution(int[] num_list) {
        int[] arr = new int[num_list.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num_list[num_list.length - i - 1];
        }
        return arr;
    }
}