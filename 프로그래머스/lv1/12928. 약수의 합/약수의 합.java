class Solution {
    public int solution(int n) {
        int sum = 1;
        for (int i = 2; i<= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        } 
        if (n == 0) {
            return 0;
        } else {
            return sum;
        }
    }
}