class Solution {
    public int solution(int[] nums) {
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    boolean check = true;
                    sum = nums[i] + nums[j] + nums[k];
                    for (int l = 2; l < sum; l++) {
                        if (sum % l == 0) {
                            check = false;
                        }
                    }
                    if (check) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}