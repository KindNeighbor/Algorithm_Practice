class Solution {
    public int solution(int a, int b) {
        int num = b / gcd(a, b);
        
        while (num > 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else if (num % 5 == 0) {
                num /= 5;
            } else {
                return 2;
            }
        }
        return 1;
    }
    
    public int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
}