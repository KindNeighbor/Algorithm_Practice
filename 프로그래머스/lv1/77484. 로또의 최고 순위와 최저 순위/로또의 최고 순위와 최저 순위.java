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
        int[] arr = new int[2];
        if (cnt + zeroCount == 6) {
            arr[0] = 1;
        } else if (cnt + zeroCount == 5) {
            arr[0] = 2;
        } else if (cnt + zeroCount == 4) {
            arr[0] = 3;
        } else if (cnt + zeroCount == 3) {
            arr[0] = 4;
        } else if (cnt + zeroCount == 2) {
            arr[0] = 5;
        } else {
            arr[0] = 6;
        }
        
        if (cnt == 6) {
            arr[1] = 1;
        } else if (cnt == 5) {
            arr[1] = 2;
        } else if (cnt == 4) {
            arr[1] = 3;
        } else if (cnt == 3) {
            arr[1] = 4;
        } else if (cnt == 2) {
            arr[1] = 5;
        } else {
            arr[1] = 6;
        }
        return arr;
    } 
}