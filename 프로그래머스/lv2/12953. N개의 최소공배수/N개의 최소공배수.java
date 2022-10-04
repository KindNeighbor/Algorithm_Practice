class Solution {
    public int solution(int[] arr) {
        int a = 1;
        for (int i = 0; i < arr.length; i++) {
            a = lcm(arr[i],a);
        }
        return a;
    }
    
    public int gcd(int x, int y) {
        if (x % y == 0) {
            return y;
        }
        return gcd(y, x % y);
    }
    
    public int lcm(int x, int y) {
        return ((x * y) / gcd(x, y));
    }
}