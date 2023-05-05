class Solution {
    public int solution(String myString, String pat) {
        int cnt = 0;
        int l = pat.length();
        for (int i = 0; i < myString.length() - l + 1; i++) {
            String s = myString.substring(i, i+l);
            if (s.equals(pat)) {
                cnt++;
            }
        }

        return cnt;
    }
}