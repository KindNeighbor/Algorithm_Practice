class Solution {
    public int solution(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = i; j <= n; j++) {
                if (sum == n) {
                    ans += 1;
                    break;
                } else if (sum > n) {
                    break;
                }
                sum += j;
            }
        }
        
        return ans + 1;
    }
}