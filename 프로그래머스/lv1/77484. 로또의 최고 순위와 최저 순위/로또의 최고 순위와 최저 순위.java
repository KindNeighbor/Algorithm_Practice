class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int cnt = 0;
        int zeroCount = 0;
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                    zeroCount++;   
                }
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    cnt++;
                }
            }
        }
        int max = 7 - (cnt + zeroCount);
        int min = 7 - cnt;
        if (max == 7) {max = 6;}
        if (min == 7) {min = 6;}
        
        int[] arr = new int[2];
        
        arr[0] = max;
        arr[1] = min;
        
        return arr;
        
    } 
}