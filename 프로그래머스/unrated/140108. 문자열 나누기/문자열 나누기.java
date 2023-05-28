class Solution {
    public int solution(String s) {
        int cnt = 0;
        int aCnt = 0;
        int bCnt = 0;
        char c = '*';
        for (int i = 0; i < s.length(); i++) {            
            if (aCnt == 0) {
                c = s.charAt(i);
                aCnt++;
            } else {
                if (s.charAt(i) == c) {
                    aCnt++;
                } else {
                    bCnt++;
                    if (bCnt == aCnt) {
                        cnt++;
                        aCnt = 0;
                        bCnt = 0;
                    }
                }
            }
            
            if (i == s.length() - 1 && aCnt > 0) {
                cnt++;
            }
        }

        return cnt;
    }
}