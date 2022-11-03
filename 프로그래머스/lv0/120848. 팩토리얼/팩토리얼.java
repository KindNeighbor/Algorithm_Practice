class Solution {
    public int solution(int n) {
        
        int ans = 0;
    
        
        for (int i = 1; i <= 11; i++) {
            if (factorial(i) <= n) {
                continue;
            } else {
                ans = i;
                break;
            }
        }
        
        return ans - 1;
    }
    
    public int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        
        return n * factorial(n-1);
    }
}