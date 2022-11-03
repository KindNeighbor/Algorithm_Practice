class Solution {
    
    public int solution(int n) {
        
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (getPrime(i)) {
                cnt++;
            }
        }
        
        return n - cnt;
    }
    
    public boolean getPrime(int x) {
        
        
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}