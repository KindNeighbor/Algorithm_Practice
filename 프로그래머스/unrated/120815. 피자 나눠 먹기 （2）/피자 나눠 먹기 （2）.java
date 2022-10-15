class Solution {
    public int solution(int n) {
        int a = gcd(n, 6);
        return n / a;
    }
    
    public int gcd(int x, int y) {
        if(x % y == 0) {
            return y;
        }
        return gcd(y, x % y);
    }
}