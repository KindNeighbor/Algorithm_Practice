class Solution {
    
    public int solution(int n) {
        
        int cnt = 0;
        
        for (int i = 0; i < 10000; i++) {
            if (curseNumber(i)) {
                cnt++;
            }
            
            if (cnt == n) {
                return i;
            }
        }
        return 0;
    }
    
    public boolean curseNumber(int n) {
        
        if (n % 3 == 0) {
            return false;
        }
        
        
        while (n > 1) {
            int num = n % 10;
            if (num == 3) {
                return false;
            }
            
            n /= 10;
        }
        
        return true;
    }
}