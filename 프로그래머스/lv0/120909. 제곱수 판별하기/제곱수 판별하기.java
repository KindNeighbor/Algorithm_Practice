class Solution {
    public int solution(int n) {
        Double ans = Math.sqrt(n);
        if (ans == ans.intValue()) {
            return 1;
        } else {
            return 2;
        }
    }
}