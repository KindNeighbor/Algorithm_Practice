class Solution {
    public int solution(String A, String B) {
        
        if (A.equals(B)) {
            return 0;
        }
        
        int cnt = 0;
        for (int i = 0; i < B.length(); i++) {
            A = A.charAt(A.length() - 1) + A.substring(0, A.length() - 1);
            cnt++;
            if (A.equals(B)) {
                return cnt;
            }
        }

        return -1;
    }
}