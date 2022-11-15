class Solution {
    public int solution(int i, int j, int k) {
        
        char K = Character.forDigit(k, 10);
        int cnt = 0;
        
        for (int l = i; l <= j; l++) {
            String num = Integer.toString(l);
            for (int m = 0; m < num.length(); m++) {
                if (num.charAt(m) == K) {
                    cnt++;
                }
            }
        }

        return cnt;
    }
}