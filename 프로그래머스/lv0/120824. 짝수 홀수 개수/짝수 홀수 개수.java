class Solution {
    public int[] solution(int[] num_list) {
        
        int cntE = 0;
        int cntO = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                cntE++;
            } else if (num_list[i] % 2 != 0) {
                cntO++;
            }
        }
        
        int[] arr = new int[2];
        arr[0] = cntE; arr[1] = cntO;
        return arr;
    }
}